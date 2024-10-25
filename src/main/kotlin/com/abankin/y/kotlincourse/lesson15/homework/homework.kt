package com.abankin.y.kotlincourse.lesson15.homework

fun main() {

    println("---------------Вечеринка---------------")
    val party = Party("New-York", 10)
    party.details()

    println("---------------Эмоции---------------")
    val emotion = Emotion("Радость", 100500)
    emotion.express()

    println("---------------Луна---------------")
    val moon = Moon
    moon.isVisible = true
    moon.phase = "Полная Луна"
    moon.showPhase()

    println("---------------Концерт---------------")
    val concert = Concert("Metallica", "Carnegie Hall", 100.99, 1000)
    concert.concertInfo()
    concert.buyATicket()
    concert.buyATicket()

    println("---------------Полка стеллажа---------------")
    val shelf = Shelf(10, mutableListOf())
    shelf.addItem("qqq") //Добавление предмета
    shelf.addItem("aaa")
    shelf.addItem("bbb")
    shelf.removeItem("aaa") //Удаление предмета
    println(shelf.items) //Вывод предметов на полке
    println(shelf.canAccommodate("5555555555555555555")) //Проверка вместимости
    println(shelf.isInStock("bbb")) //Проверка наличия предмета
    println(shelf.itemList()) //Список предметов

    println("---------------Стеллаж---------------")

    val shelf2 = Shelf(20, mutableListOf()) //Добавляем вторую полку
    shelf2.addItem("1111")
    shelf2.addItem("2222")
    shelf2.addItem("0000000000000")

    val shelf3 = Shelf(5, mutableListOf()) //Добавляем третью полку
    shelf3.addItem("55555")

    val rack = Rack(mutableListOf(), 10)
    println(rack.addShelf(shelf)) //Первую полку на стеллаж
    println(rack.addShelf(shelf2)) //Вторую полку на стеллаж
    println(rack.addShelf(shelf3)) //Третью полку на стеллаж
    println(rack.removeShelf(2)) //Убираем третью полку со стеллажа
    println(rack.addItem("1024 22")) //Добавляем предмет на самую свободную полку
    println(rack.isItemInRack("1111")) //Проверяем есть ли предмет на стеллаже
    println(rack.getShelves()) // Список полок
    rack.printContents() // Печать содержимого стеллажа

    println(rack.advancedRemoveShelf(0)) // Удаляем полку с распределением предметов
    rack.printContents() // Еще раз содержимое

}