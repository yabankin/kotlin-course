package com.abankin.y.kotlincourse.lesson18.homework

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}