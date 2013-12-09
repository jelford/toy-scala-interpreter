package com.jameselford.sample.scalasbt.calculator

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.BeforeAndAfter
import com.jameselford.sample.scalasbt.calculator.tokens.OperatorToken

@RunWith(classOf[JUnitRunner])
class Addition extends FlatSpec with BeforeAndAfter {

  var calculator: Calculator = _
  
  before {
    calculator = new Calculator
  }
  
  it should "add 0 and 0" in {
    assert(calculator.add(0, 0) === 0)
  }
  
  it should "add two positive numbers" in {
    assert(calculator.add(1,3) === 4)
  }
  
  it should "add a positive and negative number" in {
    assert(calculator.add(1,-5) === -4)
  }
  
  it should "add a negative and a positive number" in {
    assert(calculator.add(-1, 5) === 4)
  }
  
  it should "add two negative numbers" in {
    assert(calculator.add(-1, -3) === -4)
  }
  
  
}