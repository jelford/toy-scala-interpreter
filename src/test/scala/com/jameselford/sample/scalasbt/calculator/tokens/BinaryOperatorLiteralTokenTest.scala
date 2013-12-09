package com.jameselford.sample.scalasbt.calculator.tokens

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.jameselford.sample.scalasbt.calculator.tokens.TokenTestHelper._
//import com.jameselford.sample.scalasbt.calculator.tokens.BinaryToken
import org.scalatest.Ignore

@Ignore
@RunWith(classOf[JUnitRunner])
class BinaryOperatorLiteralTokenTest extends FlatSpec with Matchers {
	it should "yield a binary operator token when one is given" in {
	  lexing("+") shouldEqual(BinaryToken.PLUS)
	}
}