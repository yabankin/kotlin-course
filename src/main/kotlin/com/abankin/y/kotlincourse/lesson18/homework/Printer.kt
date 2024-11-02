package com.abankin.y.kotlincourse.lesson18.homework

abstract class Printer {
    abstract fun print(text: String)
    protected fun splitText(text: String): List<String>{
       return text.split(" ")
    }
}