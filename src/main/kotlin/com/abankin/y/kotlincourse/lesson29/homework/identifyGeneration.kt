package com.abankin.y.kotlincourse.lesson29.homework

import java.time.LocalDate

private val boomerStart = LocalDate.of(1946, 1, 1)
private val boomerEnd = LocalDate.of(1964, 12, 31)
private val zoomerStart = LocalDate.of(1997, 1, 1)
private val zoomerEnd = LocalDate.of(2012, 12, 31)

fun identifyGeneration(birthDate: LocalDate): String {
    return when {
        birthDate.isAfter(boomerStart.minusDays(1)) && birthDate.isBefore(boomerEnd.plusDays(1)) -> "Бумер"
        birthDate.isAfter(zoomerStart.minusDays(1)) && birthDate.isBefore(zoomerEnd.plusDays(1)) -> "Зумер"
        else -> "Не определено"
    }
}

