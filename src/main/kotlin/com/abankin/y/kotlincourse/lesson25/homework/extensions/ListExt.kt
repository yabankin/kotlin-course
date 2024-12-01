package com.abankin.y.kotlincourse.lesson25.homework.extensions

fun List<Int>.unique(): List<Int> {
    return this.distinct()
}