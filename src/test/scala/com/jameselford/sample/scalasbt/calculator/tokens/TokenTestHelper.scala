package com.jameselford.sample.scalasbt.calculator.tokens

import java.io.ByteArrayInputStream
import com.jameselford.sample.scalasbt.calculator.parser.Parser

object TokenTestHelper {
  
	def lexing(x : String) : Token = {
	  new Parser(new ByteArrayInputStream(x.getBytes("utf-8"))).nextToken()
	}
}