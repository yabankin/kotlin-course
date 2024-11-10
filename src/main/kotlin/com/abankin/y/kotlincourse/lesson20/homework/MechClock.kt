package com.abankin.y.kotlincourse.lesson20.homework

abstract class MechClock: Mechanical, Timable {
    var hour = 12 // часы
    var minute = 30 // минуты
    var second = 59 // секунды
    var isWound = true // заведены или нет
}