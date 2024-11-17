package com.abankin.y.kotlincourse.lesson22.homework.extensions

//Реализуйте функцию-расширение для класса словаря допускающего null с ключами дженериком и значениями типа список из такого же дженерика,
//которая принимает один аргумент типа число и возвращает словарь допускающий null с
//ключами типа строка и значениями типа дженерика допускающего null.
fun <T> Map<T, List<T?>>?.mapExt(arg1: Number): Map<String, T?>?{
    return this?.map { (key, value) ->
        key.toString() to value.getOrNull(arg1.toInt())
    }?.toMap()
}