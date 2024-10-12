package com.abankin.y.kotlincourse.lesson12

fun main() {

    val result1 = multiplyByTwo(1024)
    print("$result1\n")
    val result2 = isEven(2099)
    print("$result2\n")
    val result3 = printNumbersUntil(9)
    val result4 = findFirstNegative(listOf(1,2,4,5,7))
    print("$result4\n")
    val result5 = processList(listOf("123", null, "asd"))
    print("$result5\n")
    drawRectangle(100,10)
    println("-------------------------------------------------")
    drawRectangleRefactor(100,10)

}

//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения
fun fun1() {
}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun fun2(a: Int, b: Int) = a + b

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun fun3(s: String) {

}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun fun4(l: List<Int>): Double {
    return Double.MAX_VALUE
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun fun5(s: String?): Int? {
    return s?.length
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число
fun fun6(): Double? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения
fun fun6(l: List<Int?>) {

}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun fun7(i: Int): String? {
    return ""
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun fun8(): List<String?> {
    return listOf()
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun fun9(s: String?, i: Int?): Boolean {
    return false
}

//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(num: Int): Int {
    return num * 2
}

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(num1: Int): Boolean {
    return num1 % 2 == 0
}

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    else{
        for(i in 1..n){
            print("$i ")
        }
        println()
    }
}

//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
//Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(list1: List<Int>): Int? {
    for (l in list1){
        if (l < 0) {return l}
    }
    return null
}

//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
//Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения
fun processList(list2: List<String?>) {
    for (l in list2){
        if (l == null) return
        println(l)
    }
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
//Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.
fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

    // Боковые границы
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}

fun drawRectangleRefactor(width: Int, height: Int) {

    if (width <= 0 || height <= 0) throw Exception ("width и height должно быть положительным и больше нуля")
    //нижняя или верхняя граница
    fun headerOrBottom(): String = "+" + "-".repeat(width - 2) + "+\n"
    //боковые границы
    fun sides(): String = "|" + " ".repeat(width - 2) + "|\n"
    //верхняя граница
    print(headerOrBottom())
    //боковина
    repeat(height - 2) {print(sides())}
    //нижняя граница
    print(headerOrBottom())
}