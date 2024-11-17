package com.abankin.y.kotlincourse.lesson22.homework.extensions

//Определите функцию-расширение для класса длинного числа, допускающее null, которая не принимает аргументов и возвращает строку.
fun Long?.longExt(): String{
    return this.toString()
}