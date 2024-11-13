package com.abankin.y.kotlincourse.lesson21.homework

class OddValidator : Validator<Int> {
    override fun isValid(element: Int): Boolean {
        return element % 2 == 0
    }
}