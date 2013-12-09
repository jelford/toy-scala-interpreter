package com.jameselford.sample.scalasbt.calculator.tokens

object BinaryToken {
  val PLUS = new BinaryToken
}

class BinaryToken extends OperatorToken {

  def precede(e : Expression) : UnaryOperatorToken = {
    new UnaryOperatorToken
  }
}