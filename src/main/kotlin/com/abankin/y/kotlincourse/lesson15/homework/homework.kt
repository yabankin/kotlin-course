package com.abankin.y.kotlincourse.lesson15.homework

fun main(){

val party = Party("New-York", 10)
    party.details()

val emotion = Emotion("Радость", 100500)
    emotion.express()

val moon = Moon
    moon.isVisible = true
    moon.phase = "Полная Луна"
    moon.showPhase()

val concert = Concert("Metallica", "Carnegie Hall", 100.99, 1000)
    concert.concertInfo()
    concert.buyATicket()


}