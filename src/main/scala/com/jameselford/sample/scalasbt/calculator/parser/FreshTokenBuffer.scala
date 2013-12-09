package com.jameselford.sample.scalasbt.calculator.parser

import com.jameselford.sample.scalasbt.calculator.tokens.Token
import scala.collection.immutable.HashSet

class FreshTokenBuffer extends TokenBuffer {
  def end(): Token = {
    throw new Exception("FreshTokenBuffer#end()")
  }

  def append(x: Char): TokenBuffer = {
    if (x.isDigit) {
      new NumericTokenBuffer(x)
    } else if (HashSet('+', '-', '/', '*', '=') contains x) {
      new FreshTokenBuffer
    } else {
      throw new Exception("Unknown character")
    }
  }
}