package com.abankin.y.kotlincourse.lesson10

fun main() {

    //Создайте пустое неизменяемое множество целых чисел
    val set1 = setOf<String>()

    //Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2 = setOf(1, 2, 3)

    //Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala")
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

    //Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go")
    set3.addAll(setOf("Swift", "Go"))
    println(set3)
    println("-----------------")

    //Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set4 = mutableSetOf(1, 2, 3, 4, 5)
    set4.remove(2)
    println(set4)
    println("-----------------")

    //Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set5 = setOf(12, 54, 67, 90, 111)
    for (i in set5) {
        println(i)
    }
    println("-----------------")

    //Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
    //Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    fun isStringInSet(set6: MutableSet<String>, text: String): Boolean {
        for (i in set6) {
            if (set6.contains(text)) return true
        }
        return false
    }

    val set6 = mutableSetOf("Kotlin", "Java", "Scala")
    val text = "Kotlin Power"
    val result = isStringInSet(set6, text)
    println(result)
    println("-----------------")

    //Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
    //Реши задачу с помощью циклов
    val set7 = setOf("Kotlin", "Java", "Scala")
    val set8 = setOf("Python", "C++", "Assembler", "Kotlin")
    val set9 = mutableSetOf<String>()
    for (i in set7) {
        set9.add(i)
    }
    for (i in set8) {
        set9.add(i)
    }
    println(set9)
    println("-----------------")

    //Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    val set10 = setOf(1, 2, 3, 4, 5)
    val set11 = setOf(3, 4, 5, 6, 7)
    val set12 = mutableSetOf<Int>()
    for (i in set10) {
        for (j in set11) {
            if (i == j) {
                set12.add(i)
            }
        }

    }
    println(set12)
    println("-----------------")

    //Создайте два множества строк и найдите разность первого множества относительно второго
    //(элементы, присутствующие в первом множестве, но отсутствующие во втором).
    //Реши задачу через вложенные циклы и переменные флаги
    val set13 = setOf("Kotlin", "Java", "Scala")
    val set14 = setOf("Python", "C++", "Assembler", "Kotlin")
    val set15 = mutableSetOf<String>()
        for(i in set13){
            var flag = false
            for(j in set14){
                if (i == j){
                    flag = true
                    break
            }

        }
            if (!flag) {set15.add(i)}
    }
    println(set15)
    println("-----------------")

    //Создайте множество строк и конвертируйте его в список с использованием цикла.
    val set16 = setOf("Python", "C++", "Assembler", "Kotlin")
    val list1 = mutableListOf<String>()
    for (i in set16){
        list1.add(i)
    }
    println(list1)


}



