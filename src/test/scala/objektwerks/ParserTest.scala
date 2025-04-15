package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import Parser.parseAndCalc

final class ParserTest extends AnyFunSuite with Matchers:
  test("success"):    
    parseAndCalc("1+1") shouldBe "2"
    parseAndCalc("2-1") shouldBe "1"
    parseAndCalc("2*2") shouldBe "4" // fails on macos
    parseAndCalc("4/2") shouldBe "2"
    parseAndCalc("(1+1*2)+3*4") shouldBe "15" // fails on macos
    parseAndCalc("((1+1*2)+(3*4*5))/3") shouldBe "21" // fails macos

  test("failure"):
    parseAndCalc("1+1*").startsWith("*** Parser failed:") shouldBe true