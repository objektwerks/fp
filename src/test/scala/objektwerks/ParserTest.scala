package objektwerks

import fastparse.*

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

final class ParserTest extends AnyFunSuite with Matchers:
  test("parser"):
    import Parser.*

    val Parsed.Success(2, _) = parse("1+1", expr(_))
    val Parsed.Success(15, _) = parse("(1+1*2)+3*4", expr(_))
    val Parsed.Success(21, _) = parse("((1+1*2)+(3*4*5))/3", expr(_))
    val Parsed.Failure(expected, failIndex, extra) = parse("1+1*", expr(_))
    extra.trace().longAggregateMsg.nonEmpty shouldBe true