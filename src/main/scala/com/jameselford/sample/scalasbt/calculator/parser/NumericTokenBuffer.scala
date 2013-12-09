package com.jameselford.sample.scalasbt.calculator.parser

import com.jameselford.sample.scalasbt.calculator.tokens.Token
import com.jameselford.sample.scalasbt.calculator.tokens.NumericLiteralToken
import scala.collection.mutable.ArrayBuffer

class NumericTokenBuffer(x: Char) extends TokenBuffer {
    var base = 10
    val internalBuffer = ArrayBuffer(x.asDigit)

    override def end(): Token = {
      var acc = 0
      for (x <- internalBuffer) {
        acc *= base
        acc += x
      }
      NumericLiteralToken(acc)
    }

    override def append(x: Char): TokenBuffer = {
      internalBuffer += x.asDigit
      this
    }
  }