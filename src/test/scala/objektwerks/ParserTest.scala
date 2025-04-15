package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

final class ParserTest extends AnyFunSuite with Matchers:
  test("parser"):
    import Parser.calc
    
    calc("1+1") shouldBe "2"