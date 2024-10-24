package com.abankin.y.kotlincourse.lesson15.homework

class Party(
    val location: String,
    val attendees: Int,

    ) {

    fun details() {

        println("Вечеринка пройдет в $location, на ней будет $attendees гостей")

    }
}