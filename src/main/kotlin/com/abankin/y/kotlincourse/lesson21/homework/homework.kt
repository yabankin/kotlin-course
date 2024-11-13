package com.abankin.y.kotlincourse.lesson21.homework

fun main() {

    val keys = listOf(1,2,3,4,5)
    val values = listOf("1", "2", "3", "4", "5")
    println(toMap(keys,values))
    println("----------------------------------")
    val list = listOf(1,2,3)
    println(getMiddleElement(list))
    println("----------------------------------")
    val list1 = ListHolder<Int>()
    list1.addElement(1)
    list1.addElement(2)
    println(list1.getElements())
    println("----------------------------------")
    val list2 = PhrasesToListOfStrings()
    println(list2.mapper("1 qwe 66yy tyuo 888"))
    println("----------------------------------")
    val list3 = PhrasesToListOfStrings()
    println(list3.mapperList(listOf("123","234","345")))
    println("----------------------------------")
    val str = StringValidator()
    println(str.isValid("    hjhjh     "))
    println("----------------------------------")
    val num = OddValidator()
    println(num.isValid(8))
    println("----------------------------------")
    val list4 = ListValidator<Number>()
    println(list4.isValid(listOf(1,2,3)))

}

//Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>, которая будет создавать карту из списков ключей и значений.
//Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.
fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val result: MutableMap<K, V> = mutableMapOf()
    for (i in 0..< minOf(keys.size, values.size)) {result[keys[i]] = values[i]}
    return result
}

//Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка, если он существует.
fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.isNotEmpty() && list.size % 2 != 0 && list.size != 1) {
        list[list.size / 2]
    }
    else null
}

