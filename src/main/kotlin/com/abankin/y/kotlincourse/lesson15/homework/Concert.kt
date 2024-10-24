package com.abankin.y.kotlincourse.lesson15.homework

class Concert(
    val band: String,
    val venue: String,
    val cost: Double,
    var hallCapacity: Int
) {

    fun concertInfo(){
        println("В $venue c проводится концерт группы $band. Зал вмещает $hallCapacity человек. Стоимость билета - $cost $")
    }

    fun buyATicket (){
        hallCapacity--
        println("Осталось $hallCapacity свободных билетов")
    }
}