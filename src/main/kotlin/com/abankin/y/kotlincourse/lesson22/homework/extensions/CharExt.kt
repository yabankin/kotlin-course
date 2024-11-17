package com.abankin.y.kotlincourse.lesson22.homework.extensions

//Напишите функцию-расширение для класса символа, допускающего null,
//которая принимает три аргумента: два типа число и один булево, и ничего не возвращает.
fun Char?.charExt(arg1: Number, arg2: Number, arg3: Boolean){
    println(this!! +arg1.toString()+arg2.toString())
}
