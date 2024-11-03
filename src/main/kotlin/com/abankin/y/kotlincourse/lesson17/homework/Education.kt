package com.abankin.y.kotlincourse.lesson17.homework

open class Education(
    val level: String,
    val educationYears: Int,
    val financeBase: String
)

open class School (
    level: String,
    educationYears: Int,
    financeBase: String,
    val bias: String
): Education("base", 10, "government")

class SportSchool(
    level: String,
    educationYears: Int,
    financeBase: String,
    bias: String,
    val sport: String
): School("special", 8, "government", "sport")

class College(
    level: String,
    educationYears: Int,
    financeBase: String,
    val specialization: String
): Education("middle", 5, "commercial")

class University(
    level: String,
    educationYears: Int,
    financeBase: String,
    val faculties: List<String>
): Education("high", 6, "mixed")

