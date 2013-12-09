package com.jameselford.sample.scalasbt.calculator.parser

import com.jameselford.sample.scalasbt.calculator.tokens.Token

trait TokenBuffer {
    def end(): Token
    def append(x: Char): TokenBuffer
}