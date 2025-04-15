package objektwerks

import fastparse.* 
import NoWhitespace.*

class Parser:
  def eval(tree: (Int, Seq[(String, Int)])) =
    val (base, ops) = tree
    ops.foldLeft(base) { case (left, (op, right)) =>
      op match
        case "*" => left * right
        case "/" => left / right
        case "+" => left + right
        case "-" => left - right
    }

  def number[$: P]: P[Int] =
    P(
      CharIn("0-9")
        .rep(1)
        .!
        .map(_.toInt)
    )

  def parens[$: P]: P[Int] =
    P(
      "(" ~/ addSubtract ~ ")"
    )

  def factor[$: P]: P[Int] = P( number | parens )

  def divideMultiply[$: P]: P[Int] = P( factor ~ (CharIn("*/").! ~/ factor).rep ).map(eval)

  def addSubtract[$: P]: P[Int] = P( divideMultiply ~ (CharIn("+\\-").! ~/ divideMultiply).rep ).map(eval)

  def expr[$: P]: P[Int]   = P( addSubtract ~ End )