package com.abankin.y.kotlincourse.lesson17.homework

open class GeometricFigures (
    val name: String
) {
    open fun area(): Double{
        return 0.0
    }
}

open class Polygon (
    name: String,
    val angles: Int
) : GeometricFigures("Polygon")

class Circle (
    name: String,
    val radius: Double
): GeometricFigures("Circle"){

    override fun area(): Double {
        return 3.14 * radius * radius
    }
}

class Triangle(
    name: String,
    angles: Int,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
):Polygon("Triangle", 3)

class Quadrangle(
    name: String,
    angles: Int,
    val sideA: Int,
    val sideB: Int,
    val sideC: Int,
    val sideD: Int
):Polygon("Quadrangle",4)