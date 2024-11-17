package com.abankin.y.kotlincourse.lesson22.homework.extensions

//Создайте функцию-расширение для класса изменяемого списка элементов с дженериком, которая принимает два аргумента:
//один типа дженерик, допускающий null, и другой типа число, и возвращает значение типа дженерик, допускающий null.
fun <T> MutableList<T>.mutableListExt(arg1: T?, arg2: Number): T?{
    return this.first()
}