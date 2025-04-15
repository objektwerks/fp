package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import Parser.parseAndCalc

final class ParserTest extends AnyFunSuite with Matchers:
  test("parser"):    
    parseAndCalc("1+1") shouldBe "2"