package com.jameselford.sample.scalasbt.calculator.tokens

import java.lang.Number

object NumericLiteralToken {
  def apply[T <: Number](literal: T) : NumericLiteralToken[T] = {
    new NumericLiteralToken(literal, literal.getClass())
  }
  
  def apply(literal : Int) : NumericLiteralToken[Integer] = {
    new NumericLiteralToken(literal, classOf[Integer])
  }
  
  def apply(literal : Double) : NumericLiteralToken[java.lang.Double] = {
    new NumericLiteralToken(literal, literal.getClass())
  }
}

class NumericLiteralToken[T <: Number](token: T, tokenType: Class[_]) extends Token {
  val literal = token
  val literalType = tokenType

  override def equals(o: Any) : Boolean = {
    if (o == null) {
      return false
    }
    
      
    if ( o.isInstanceOf[NumericLiteralToken[T]] ) {
      val that = o.asInstanceOf[NumericLiteralToken[_]]
      return literal == that.literal && literalType == that.literalType
    } else {
      return false
    }
  }
}

