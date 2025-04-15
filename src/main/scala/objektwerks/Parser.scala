package objektwerks

import fastparse.*, NoWhitespace.*

object Parser:
  def parseAndCalc(expression: String): String =
    parse[Int](expression, p => { given P[?] = p; expr }) match
      case Parsed.Success[Int](value, _) => value.toString
      case Parsed.Failure(_, _, extra) => s"*** Parser failed: ${extra.trace().longAggregateMsg}"

  private def calc(tree: (Int, Seq[(String, Int)])) =
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
    ).map(calc)

  private def addSubtract[$: P]: P[Int] =
    P(
      divideMultiply ~ ( CharIn("+\\-").! ~/ divideMultiply ).rep
    ).map(calc)

  private def expr[$: P]: P[Int] =
    P(
      addSubtract ~ End
    )