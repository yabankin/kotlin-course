package com.abankin.y.kotlincourse.lesson10

fun main() {

    //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5
    val array1 = arrayOf(1, 2, 3, 4, 5)

    //Создайте пустой массив строк размером 10 элементов.
    val array2 = Array(10) { "" }

    //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val array3 = DoubleArray(5)
    for (i in array3.indices) {
        array3[i] = i * 2.0
        println(array3[i])
    }
    println("-----------------")

    //Создайте массив из 5 элементов типа Int.
    // Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3
    val array4 = IntArray(5)
    for (i in array4.indices) {
        array4[i] = i * 3
        println(array4[i])
    }
    println("-----------------")

    //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками
    val array5: Array<String?> = arrayOf(null, "qwe", "asd")

    //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val array6 = arrayOf(1, 2, 3, 4, 5, 6)
    val array7 = IntArray(6)
    for (i in array6.indices) {
        array7[i] = array6[i]
        println(array7[i])
    }
    println("-----------------")

    //Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val array8 = arrayOf(10, 9, 8, 7, 6)
    val array9 = arrayOf(1, 2, 3, 4, 5)
    val array10 = IntArray(5)
    for (i in array8.indices) {
        array10[i] = array8[i] - array9[i]
        println(array10[i])
    }
    println("-----------------")

    //Создайте массив целых чисел. Найдите индекс элемента со значением 5.
    // Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    val array11 = arrayOf(13, 7, 5, 54, 5, 299)
    var index = 0
    var foundIndex = false
    while (index < array11.size) {
        if (array11[index] == 5) {
            println(index)
            foundIndex = true
        }
        index++
    }
    if (!foundIndex) println("-1")
    println("-----------------")

    //Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
    //Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val array12 = arrayOf(12, 5, 16, 87, 54)
    for (i in array12.indices){
        if (array12[i] % 2 == 0){
            println("${array12[i]} четное")
        } else println("${array12[i]} нечетное")
    }
    println("-----------------")

    //Создай функцию, которая принимает массив строк и строку для поиска.
    //Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
    //Верни найденный элемент из функции в виде строки.
    val array13 = arrayOf("qwe33","45dg", "dsfsqw", "678oop")
    val search = "33"
    fun searchElement(array13: Array<String>, search: String): String {
        for (i in array13.indices) {
            if (array13[i].contains(search)) {
                return array13[i]
            }
        }
        return "вхождений не найдено"
    }
    val result = searchElement(array13,search)
    println(result)
}