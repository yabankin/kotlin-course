package com.abankin.y.kotlincourse.lesson29.homework

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.OffsetTime
import java.time.Period
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {

    //Создай текущую временнУю метку и выведи её на печать
    val timeStamp = Instant.now()
    println(timeStamp)

    //Создай дату своего дня рождения.
    val bday = LocalDate.of(1986, 2, 28)
    println(bday)

    //Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val period = Period.between(bday,LocalDate.now())
    println(period.years)

    //Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того, содержит ли аргумент время и часовой пояс.
    //Temporal - это общий тип для разных классов даты-времени. В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном объекте.
    //Обработай в методе все типы дат, которые знаешь.
    //Реализуй два варианта функции - с собственным форматированием и с форматами из ISO коллекции.
    val date = LocalDate.now()
    val dateTime = LocalDateTime.now()
    val zonedDateTime = ZonedDateTime.now()
    val offsetDateTime = OffsetDateTime.now()
    val offsetTime = OffsetTime.now()
    val time = LocalTime.now()

    println(formatTemporalMy(date))
    println(formatTemporalISO(date))

    //Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше. Не используй в них метод now()
    val date1 = LocalDate.of(2022, 12, 15)
    val dateTime1 = LocalDateTime.of(2022, 12, 15, 10, 30, 25)
    val zonedDateTime1 = ZonedDateTime.of(2022, 12, 15, 10, 30, 25, 0, ZoneId.of("Europe/Moscow"))
    val offsetDateTime1 = OffsetDateTime.of(2022, 12, 15, 10, 30, 25, 0, ZoneOffset.of("+03:30"))
    val offsetTime1 = OffsetTime.of(10, 30, 25, 0, ZoneOffset.of("+03:30"))
    val time1 = LocalTime.of(10, 30, 25)

    println(formatTemporalMy(date1))
    println(formatTemporalMy(dateTime1))
    println(formatTemporalMy(zonedDateTime1))
    println(formatTemporalMy(offsetDateTime1))
    println(formatTemporalMy(offsetTime1))
    println(formatTemporalMy(time1))

    //Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку, определяющую, к какому поколению принадлежит человек: "Бумер" для тех,
    //кто родился с 1946 по 1964 год включительно, и "Зумер" для тех, кто родился с 1997 по 2012 год включительно.
    //Если дата рождения не попадает ни в один из этих диапазонов, функция должна возвращать "Не определено".
    //Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate). Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.
    val boomer = LocalDate.of(1950, 5, 15)
    val zoomer = LocalDate.of(2000, 8, 25)
    val noBoomerNoZoomer = LocalDate.of(1985, 3, 10)

    println(identifyGeneration(boomer))
    println(identifyGeneration(zoomer))
    println(identifyGeneration(noBoomerNoZoomer))

    //Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату в месяц и день.
    //Выведи первую отформатированную дату, прибавив к ней 10 дней.
    //Выведи вторую отформатированную дату, прибавив к ней 10 дней.
    //Найди отличия)))
    val date3 = LocalDate.of(2023,2,25)
    val date4 = LocalDate.of(2024,2,25)
    val formatter = DateTimeFormatter.ofPattern("MMMM dd")
    val formattedDate3 = date3.plusDays(10).format(formatter)
    val formattedDate4 = date4.plusDays(10).format(formatter)
    println(formattedDate3)
    println(formattedDate4)



}

fun formatTemporalMy(temporal: Temporal): String {
    return when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss VV"))
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z"))
        is OffsetTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss Z"))
        is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    else -> throw IllegalArgumentException("Неизвестный тип даты/времени")
    }
}

fun formatTemporalISO(temporal: Temporal): String {
    return when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        is OffsetTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_TIME)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_TIME)
        else -> throw IllegalArgumentException("Неизвестный тип даты/времени") } }