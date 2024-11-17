package com.abankin.y.kotlincourse.lesson22.homework.extensions

//Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел.
fun Array<Int>.arrayExt(): Pair<Number, Number>{
    val min = this.minOf { it }
    val max = this.maxOf { it }
    return min to max
}
