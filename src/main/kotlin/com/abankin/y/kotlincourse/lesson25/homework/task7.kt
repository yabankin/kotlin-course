package com.abankin.y.kotlincourse.lesson25.homework

val concatenateAnonymous = fun(
    map: Map<List<String>, Set<Int>>,
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

    return map.toString() + intArg + doubleArg + stringArg + listArg + setArg + mapArg + booleanArg + charArg + longArg + floatArg + byteArg + shortArg
}


val concatenateLambda: (
    Map<List<String>, Set<Int>>,
    Int,
    Double,
    String,
    List<String>,
    Set<Int>,
    Map<String, Int>,
    Boolean,
    Char,
    Long,
    Float,
    Byte,
    Short
) -> String = { map, intArg, doubleArg, stringArg, listArg, setArg, mapArg, booleanArg, charArg, longArg, floatArg, byteArg, shortArg ->
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

    map.toString() + intArg + doubleArg + stringArg + listArg + setArg + mapArg + booleanArg + charArg + longArg + floatArg + byteArg + shortArg
}

val concatenateLambdaNoType = { map: Map<List<String>, Set<Int>>, intArg: Int, doubleArg: Double, stringArg: String, listArg: List<String>, setArg: Set<Int>, mapArg: Map<String, Int>, booleanArg: Boolean, charArg: Char, longArg: Long, floatArg: Float, byteArg: Byte, shortArg: Short ->
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

    map.toString() + intArg + doubleArg + stringArg + listArg + setArg + mapArg + booleanArg + charArg + longArg + floatArg + byteArg + shortArg
}


