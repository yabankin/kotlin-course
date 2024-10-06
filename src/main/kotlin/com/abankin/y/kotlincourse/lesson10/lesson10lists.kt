package com.abankin.y.kotlincourse.lesson10

fun main(){

    //Создайте пустой неизменяемый список целых чисел.
    val list1: List<Int> = listOf()

    //Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2 = listOf("Hello", "World", "Kotlin")

    //Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3 = mutableListOf(1,2,3,4,5)

    //Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8)
    list3.addAll(listOf(6,7,8))

    //Имея изменяемый список строк, удалите из него определенный элемент (например, "World")
    val list4 = mutableListOf("Hello", "World", "Kotlin")
    list4.remove("World")
    println(list4)
    println("---------------")

    //Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list5 = listOf(1,2,3,4,5)
    for(i in list5.indices){
        println(list5[i])
    }
    println("---------------")

    //Создайте список строк и получите из него второй элемент, используя его индекс.
    val list6 = listOf("qwe","eqw","asd", "dsa")
    println(list6[1])
    println("---------------")

    //Имея изменяемый список чисел,
    //измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    val list7 = mutableListOf(1,2,3,4,5)
    list7.set(1,999)
    println(list7)
    println("---------------")

    //Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
    //Реши задачу с помощью циклов.
    val list8 = listOf("qwe","ewq","asd","dsa")
    val list9 = listOf("1","2","3","4","5")
    val list10 = mutableListOf<String>()
    for (i in list8.indices){
        list10.add(list8[i])
    }
    for (i in list9.indices){
        list10.add(list9[i])
    }
    println(list10)
    println("---------------")

    //Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val list11 = listOf(1,11,456,-123,87,93)
    var min= Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (i in list11) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    println("минимальный: $min, максимальный $max")
    println("---------------")

    //Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list12 = listOf(1,14,68,93,142,0)
    val list13 = mutableListOf<Int>()
    for (i in list12.indices){
        if (list12[i] % 2 == 0 && list12[i] != 0){
            list13.add(list12[i])
        }
    }
    println(list13)
    println("---------------")


}