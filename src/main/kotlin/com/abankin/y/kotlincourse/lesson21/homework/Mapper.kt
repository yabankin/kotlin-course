package com.abankin.y.kotlincourse.lesson21.homework

interface Mapper<T,R> {
    fun mapper(element: T): R
    fun mapperList(element: List<T>): List<R>
}