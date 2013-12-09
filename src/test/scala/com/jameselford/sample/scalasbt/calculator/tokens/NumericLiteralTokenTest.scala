package com.jameselford.sample.scalasbt.calculator.tokens

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.jameselford.sample.scalasbt.calculator.parser.Parser
import java.io.ByteArrayInputStream

import com.jameselford.sample.scalasbt.calculator.tokens.NumericLiteralToken._

import com.jameselford.sample.scalasbt.calculator.tokens.TokenTestHelper._


@RunWith(classOf[JUnitRunner])
class NumericLiteralTokenTest extends FlatSpec with Matchers {
  
	it should "distinguish between numerically equal tokens with different types" in {
	  NumericLiteralToken(5) shouldNot(equal(NumericLiteralToken(5.0)))
	}
	
	it should "match tokens of the same literal" in {
	  NumericLiteralToken(5) shouldEqual(NumericLiteralToken(5))
	}
	
	it should "yield an integer when the parser finds a number on its own" in {
	  lexing("5") shouldEqual(NumericLiteralToken(5))
	}
	
	it should "yield a decimal integer when parser finds several digits" in {
	  lexing("101") shouldEqual(NumericLiteralToken(101))
	}
}
