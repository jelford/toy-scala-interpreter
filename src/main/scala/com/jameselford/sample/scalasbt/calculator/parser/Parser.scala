package com.jameselford.sample.scalasbt.calculator.parser

import com.jameselford.sample.scalasbt.calculator.tokens.Token
import scala.collection.immutable.HashSet
import com.jameselford.sample.scalasbt.calculator.tokens.NumericLiteralToken
import java.io.InputStream
import scala.collection.mutable.ArrayBuffer
import scala.language.postfixOps


class Parser(input: InputStream) {

  var buffer: TokenBuffer = new FreshTokenBuffer

  def nextToken(): Token = {
    val raw = input.read()
    if (raw == -1) {
      return buffer.end()
    }

    val next = raw toChar

    if (next isWhitespace) {
      if (!buffer.isInstanceOf[FreshTokenBuffer]) {
        nextToken()
      } else {
        val token = buffer.end()
        buffer = new FreshTokenBuffer
        token
      }
    } else {
      buffer = buffer.append(next)
      nextToken()
    }
  }
}