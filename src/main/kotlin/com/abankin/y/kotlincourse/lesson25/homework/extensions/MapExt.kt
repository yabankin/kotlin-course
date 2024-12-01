package com.abankin.y.kotlincourse.lesson25.homework.extensions

fun Map<String, Int>.keysFilter(arg: Int): List<String> {
    val result = this.filter { (key, value) -> key.length < value && key.length > arg }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст.")
    }
    return result
}

fun Map<List<String>, Set<Int>>.concatenate(
    intArg: Int,
    doubleArg: Double,
    stringArg: String,
    listArg: List<String>,
    setArg: Set<Int>,
    mapArg: Map<String, Int>,
    booleanArg: Boolean,
    charArg: Char,
    longArg: Long,
    floatArg: Float,
    byteArg: Byte,
    shortArg: Short
): String {
    println("intArg: $intArg")
    println("doubleArg: $doubleArg")
    println("stringArg: $stringArg")
    println("listArg: $listArg")
    println("setArg: $setArg")
    println("mapArg: $mapArg")
    println("booleanArg: $booleanArg")
    println("charArg: $charArg")
    println("longArg: $longArg")
    println("floatArg: $floatArg")
    println("byteArg: $byteArg")
    println("shortArg: $shortArg")

    return this.toString() + intArg + doubleArg + stringArg + listArg + setArg + mapArg + booleanArg + charArg + longArg + floatArg + byteArg + shortArg
}

