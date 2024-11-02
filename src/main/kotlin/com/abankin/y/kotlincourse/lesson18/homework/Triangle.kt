package com.abankin.y.kotlincourse.lesson18.homework

import kotlin.math.sin

class Triangle(
    val side1: Double,
    val side2: Double,
    val angle: Double
) : Shape() {

    override fun area(): Double {
        return side1 * side2 * sin(Math.toRadians(angle))
    }
}