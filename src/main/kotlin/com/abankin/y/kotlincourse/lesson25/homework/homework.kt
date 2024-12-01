package com.abankin.y.kotlincourse.lesson25.homework

import com.abankin.y.kotlincourse.lesson25.homework.extensions.concatenate
import com.abankin.y.kotlincourse.lesson25.homework.extensions.keysFilter
import com.abankin.y.kotlincourse.lesson25.homework.extensions.unique

fun main() {

    function1()
    function1Anonymous()
    function1Lambda()
    function1LambdaNoType()
    println("------------------------------------")
    val list1 = listOf(1, 2, 3, 4, 5, 5, 4, 3)
    val list2 = listOf<Int>()
    println(function2(list1))
    try {
        println(function2(list2))
    } catch (e: IllegalArgumentException) {
        println("Список пустой")
    }
    println(function2Anonymous(list1))
    println(function2Lambda(list1))
    println(function2LambdaNoType(list1))
    println("------------------------------------")
    println(function3(listOf("1", "13", "234", "56788"), 2))
    println(function3Anonymous(listOf("1", "13", "234", "56788"), 2))
    println(function3Lambda(listOf("1", "13", "234", "56788"), 2))
    println(function3LambdaNoType(listOf("1", "13", "234", "56788"), 2))
    println("------------------------------------")
    println(function4(1234599996L))
    println(function4Anonymous(1234599996L))
    println(function4Lambda(1234599996L))
    println(function4LambdaNoType(1234599996L))
    println("------------------------------------")
    println(list1.unique())
    println(uniqueAnonymous(list1))
    println(uniqueLambda(list1))
    println("------------------------------------")
    val map1 = mapOf("123" to 3, "12345" to 6, "123123123" to 5, "12332154545" to 8)
    println(map1.keysFilter(3))
    println(keysFilterAnonymous(map1,3))
    println(keysFilterLambda(map1,3))
    println(keysFilterLambdaNoType(map1,3))
    println("------------------------------------")
    val map2 = mapOf(listOf("key1", "key2") to setOf(1, 2), listOf("key3") to setOf(3))
    val result = map2.concatenate(
        intArg = 42,
        doubleArg = 3.14,
        stringArg = "Hello",
        listArg = listOf("A", "B"),
        setArg = setOf(1, 2, 3),
        mapArg = mapOf("K" to 1, "L" to 2),
        booleanArg = true,
        charArg = 'C',
        longArg = 123456789L,
        floatArg = 2.71F,
        byteArg = 1,
        shortArg = 2
    )
    println (result)
    val result1 = concatenateAnonymous(
        map2,
        42,
        3.14,
        "Hello",
        listOf("A", "B"),
        setOf(1, 2, 3),
        mapOf("K" to 1, "L" to 2),
        true,
        'C',
        123456789L,
        2.71F,
        1,
        2
    )
    println(result1)
    val result3 = concatenateLambda(map2,
        42,
        3.14,
        "Hello",
        listOf("A", "B"),
        setOf(1, 2, 3),
        mapOf("K" to 1, "L" to 2),
        true,
        'C',
        123456789L,
        2.71F,
        1,
        2)
    println(result3)
    val result4 = concatenateLambdaNoType(
        map2,
        42,
        3.14,
        "Hello",
        listOf("A", "B"),
        setOf(1, 2, 3),
        mapOf("K" to 1, "L" to 2),
        true,
        'C',
        123456789L,
        2.71F,
        1,
        2
    )
    println(result4)
}

const val text = "HELLO, PIDMARKOZ!"
fun function1() {
    println(text)
}

val function1Anonymous = fun() {
    println(text)
}

val function1Lambda: () -> Unit = {
    println(text)
}

val function1LambdaNoType = {
    println(text)
}

fun function2(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.sum().toDouble() / list.size
}

val function2Anonymous = fun(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.sum().toDouble() / list.size
}

val function2Lambda: (List<Int>) -> Double = { list ->
    require(list.isNotEmpty())
    list.sum().toDouble() / list.size
}

val function2LambdaNoType = { list: List<Int> ->
    require(list.isNotEmpty())
    list.sum().toDouble() / list.size
}

fun function3(list: List<String>, number: Int): List<String> {
    require(list.isNotEmpty())
    return list.filter { it.length >= number }
}

val function3Anonymous = fun(list: List<String>, number: Int): List<String> {
    require(list.isNotEmpty())
    return list.filter { it.length >= number }
}

val function3Lambda: (List<String>, Int) -> List<String> = { list, number ->
    require(list.isNotEmpty())
    list.filter { it.length >= number }
}

val function3LambdaNoType = { list: List<String>, number: Int ->
    require(list.isNotEmpty())
    list.filter { it.length >= number }
}

fun function4(number: Long): Int {
    require(number > 0)
    return number.toString().map { it.digitToInt() }.sum()
}

val function4Anonymous = fun(number: Long): Int {
    require(number > 0)
    return number.toString().map { it.digitToInt() }.sum()
}

val function4Lambda: (Long) -> Int = { number ->
    require(number > 0)
    number.toString().map { it.digitToInt() }.sum()
}

val function4LambdaNoType = {number: Long ->
    require(number > 0)
    number.toString().map { it.digitToInt() }.sum()
}

val uniqueAnonymous = fun(list: List<Int>): List<Int> {
    return list.distinct()
}

val uniqueLambda: (List<Int>) -> List<Int> = { list ->
    list.distinct()
}

val keysFilterAnonymous = fun(map: Map<String, Int>, arg: Int): List<String> {
    val result = map.filter { (key, value) -> key.length < value && key.length > arg }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст.")
    }
    return result
}

val keysFilterLambda: (Map<String, Int>, Int) -> List<String> = { map, arg ->
    val result = map.filter { (key, value) -> key.length < value && key.length > arg }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст.")
    }
    result
}

val keysFilterLambdaNoType = { map: Map<String, Int>, arg: Int ->
    val result = map.filter { (key, value) -> key.length < value && key.length > arg }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст.")
    }
    result
}



