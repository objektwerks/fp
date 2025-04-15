package objektwerks

import fastparse.* 
import NoWhitespace.*

object Parser:
  def calc(expression: String): String =
    parse(expression, expr(_)) match
      case Parsed.Success[Int](value, index) => value.toString
      case Parsed.Failure(label, index, extra) => s"parser failed: ${extra.trace().longAggregateMsg}"

  private def eval(tree: (Int, Seq[(String, Int)])) =
    val (base, ops) = tree
    ops.foldLeft(base) { case (left, (op, right)) =>
      op match
        case "*" => left * right
        case "/" => left / right
        case "+" => left + right
        case "-" => left - right
    }

  private def number[$: P]: P[Int] =
    P(
      CharIn("0-9")
        .rep(1)
        .!
        .map(_.toInt)
    )

  private def parens[$: P]: P[Int] =
    P(
      "(" ~/ addSubtract ~ ")"
    )

  private def factor[$: P]: P[Int] =
    P(
      number | parens
    )

  private def divideMultiply[$: P]: P[Int] =
    P(
      factor ~ ( CharIn("*/").! ~/ factor ).rep
    ).map(eval)

  private def addSubtract[$: P]: P[Int] =
    P(
      divideMultiply ~ ( CharIn("+\\-").! ~/ divideMultiply ).rep
    ).map(eval)

  private def expr[$: P]: P[Int] =
    P(
      addSubtract ~ End
    )