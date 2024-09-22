package com.abankin.y.kotlincourse.lesson6

fun main() {
    season(12) //Время года

    dogsAge(9) //Возраст питомца

    typeOfTransport(0.0) //Вид транспорта

    val bonusPoints = bonus(1200) // Бонусные баллы
    println("Количество бонусных баллов " + bonusPoints)

    val filetype = typeOfFile("xlsx") //Тип файла
    println(filetype)

    println(convertTemp(78.0, 'C')) //Конвертер температуры

    clothesByWeather(13) //Рекомендации по одежде

    videoRating(3) //Ограничения по возрасту

}

//Функция, которая на основе номера месяца возвращает сезон года
fun season(month: Int) {
    return when (month) {
        12, 1, 2 -> println("Зима")
        3, 4, 5 -> println("Весна")
        6, 7, 8 -> println("Лето")
        9, 10, 11 -> println("Осень")
        else -> println("Некорректный номер месяца")
    }
}

//Функция, которая преобразует возраст собаки в "человеческие" годы
fun dogsAge(dogAge: Int) {
    return if (dogAge <= 2) {
        println("Возраст эквивалентен " + (dogAge * 10.5))
    } else println("Возраст эквивалентен " + (2 * 10.5 + (dogAge - 2) * 4))
}

//Функция, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута
fun typeOfTransport(distance: Double) {
    return when {
        distance <= 0 -> println("Вы уже на месте")
        distance <= 1 -> println("Пешком")
        distance <= 5 -> println("Велосипед")
        else -> println("Автотранспорт")
    }
}

//Функцию, которая принимает сумму покупки и возвращает количество бонусных баллов
fun bonus(amount: Int): Int {
    return if (amount <= 1000) {
        (amount / 100) * 2
    } else {
        val bonusBefore1000 = (1000 / 100) * 2
        val bonusAfter1000 = ((amount - 1000) / 100) * 5
        bonusBefore1000 + bonusAfter1000
    }
}

//Функция, которая на основе расширения файла возвращает его тип
fun typeOfFile(extension: String): String {
    return when (extension) {
        "txt", "doc", "docx", "rtf" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif", "bmp" -> "Изображение"
        "xls", "xlsx", "csv" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

//Функция, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F)
fun convertTemp(temperature: Double, measurementUnit: Char): String {
    return when (measurementUnit) {
        'C' -> {
            val result = (temperature * 9/5) + 32
            "$result F"
        }
        'F' -> {
            val result = (temperature - 32) * 5/9
            "$result C"
        }
        else -> {
            "Неверная единица измерения"
        }
    }
}

//Функция, которая на основе температуры воздуха рекомендует тип одежды
fun clothesByWeather (temperature: Int) {
    return when {
        temperature <= 0 -> {
            println("Куртка и шапка")
        }
        temperature in 0..15 -> {
            println("Ветровка")
        }
        temperature in 15..35 -> {
            println("Футболка и шорты")
        }
        (temperature <= -30) || (temperature >= 35) -> {
            println("Не выходите из дома")
        }
        else -> {}
    }
}

//Функция, которая принимает возраст зрителя и возвращает доступные для него категории фильмов
fun videoRating(age: Int) {
    if (age in 0..12) {
        println("Вам доступны детские фильмы")
    } else if (age in 13..17) {
        println("Вам доступны детские и подростковые фильмы")
    } else {
        println("Вам доступны все категории фильмов")
    }
}