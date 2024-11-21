package com.abankin.y.kotlincourse.lesson23.homework

fun main(){

    val data1 = null
    analyzeDataType(data1)
    val data2 = listOf(1,2,null,5f,18L)
    println(safeCastToList(data2))
    val data3 = "Строка"
    println(getStringLengthOrZero(data3))
    val data4 = "7"
    println(square(data4))
    val data5 = listOf("1", 2, 3, null, 199)
    println(sumIntOrDoubleValues(data5))
    val data6 = listOf("строка1", null, 123, "строка2")
    tryCastToListAndPrint(data6)

}

fun analyzeDataType(data: Any?) {
    when {
        data is String -> println("Это строка: $data")
        data is Int -> println("Это целое число: $data")
        data is List<*> -> println("Это список, количество элементов: ${data.size}")
        data is Map<*, *> -> println("Это карта, количество пар: ${data.entries.size}")
        else -> println("Неизвестный тип")
    }
}

fun safeCastToList(data: Any?): Int{
    return (data as? List<*>)?.size ?: -1
}

fun  getStringLengthOrZero(data: Any?): Int{
    return (data as? String)?.length ?:0
}

fun square(data: Any?): Double {
    return when {
        data is Number -> data.toDouble() * data.toDouble()
        data is String -> data.toDouble() * data.toDouble()
        else -> 0.0
    }
}

fun sumIntOrDoubleValues(data: List<Any?>): Double {
    var sum = 0.0
    for (i in data) {
        if (i is Int) {
            sum += i.toDouble()
        } else if (i is Double) {
            sum += i
        }
    }
    return sum
}

fun tryCastToListAndPrint(data: Any?) {
    val list = data as? List<*>
    if (list != null) {
        for (i in list) {
            if (i is String) {
                println(i)
            } else {
                println("Элемент $i не является строкой")
            }
        }
    } else {
        println("$data - не список")
    }
}







