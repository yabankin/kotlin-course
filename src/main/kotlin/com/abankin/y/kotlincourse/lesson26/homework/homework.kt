package com.abankin.y.kotlincourse.lesson26.homework



fun main() {
    //-------------------------------1-------------------------------------------
    val names = listOf("Михаил", "Дарья", "Александр", "Лев", "Сергей")

    val containsA = filterStrings(names) { it.contains("А", ignoreCase = true) }
    println("Содержат букву 'А': $containsA")

    val longerThanThree = filterStrings(names) { it.length > 3 }
    println("Длиннее 3 символов: $longerThanThree")

    //-------------------------------2-------------------------------------------
    val numbers = listOf(1, 2, 3, 4.2, 5.8, 99, 115,6)

    val multipliedByTwo = applyToNumbers(numbers) { it.toDouble() * 2 }
    println("Умноженные на 2: $multipliedByTwo")

    val squared = applyToNumbers(numbers) { it.toDouble() * it.toDouble() }
    println("Возведенные в квадрат: $squared")

    //-------------------------------3-------------------------------------------

    val numbers1 = listOf(1, 2, 3, 4.2, 5.8, 99, 115,6)

    val sumEven = sumByCondition(numbers) { it.toInt() % 2 == 0 }
        println("Сумма четных чисел: $sumEven")

    val sumGreaterThan3 = sumByCondition(numbers) { it.toDouble() > 3 }
    println("Сумма чисел больше 3: $sumGreaterThan3")

    //-------------------------------4-------------------------------------------
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(6, 7, 8, 9, 10)

    val sum = combineAndTransform(list1, list2) { a, b -> a + b }
    println("Сумма: $sum")

    val words1 = listOf("Hello", "World", "Kotlin")
    val words2 = listOf("Good", "Bye", "Java")
    val concatenated = combineAndTransform(words1, words2) { a, b -> "$a $b" }
    println("Конкатенация элементов: $concatenated")


}


//---------------------------Syntax tasks-------------------------------------------------------------------------------
//Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
fun fun1(
    noarg: () -> Unit
) {
}

//Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
fun fun2(
    oneArg: (Int) -> String
) {
}

//Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
fun fun3(
    extInt: Int.(String) -> Boolean
) {
}

//Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean
fun fun4(
    twoDoubles: (Double, Double) -> Boolean
) {
}

//Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.
fun <T> fun5(
    argGeneric: (T) -> List<T>
) {
}

//Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию, принимающую Int и возвращающую Boolean.
fun fun6(
    reFun: (String) -> ((Int) -> Boolean)
) {

}

//Напишите функцию, которая принимает список чисел,
//множество строк, функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>
fun fun7(
    arg1: List<Int>,
    arg2: Set<String>,
    arg3: (List<Int>, Set<String>) -> Map<String, Int>
) {

}

//Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строк
fun fun8(
    arg1: Number,
    arg2: (Number) -> String
): String {
    return (arg1.toString() + arg2.toString())
}

//Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения
fun fun9(
    reFun: () -> (() -> Unit)
) {

}
//---------------------------Code tasks-------------------------------------------------------------------------------
//Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
//удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение).
//Функция должна вернуть результат фильтрации исходного списка строк.
fun filterStrings(
    list: List<String>,
    strFilter: (String) -> Boolean
): List<String>
{
    return list.filter(strFilter)
}

//Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
//преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число).
//Функция должна вернуть результат преобразования исходного списка чисел.
fun applyToNumbers(
    list: List<Number>,
    reNum: (Number) -> Number
): List<Number>
{
    return list.map(reNum)
}

//Реализуйте функцию sumByCondition, которая принимает список чисел и функцию, определяющую условие для включения числа в сумму.
//Функция должна вернуть сумму чисел, прошедших проверку.
fun sumByCondition(
    list: List<Number>,
    sumCond: (Number) -> Boolean
): Double
{
    return list.filter(sumCond).sumOf { it.toDouble() }
}

//Напишите функцию combineAndTransform, которая принимает две коллекции одного типа и функцию для их объединения
//и преобразования в одну коллекцию другого типа.
//Функция должна вернуть результат преобразования (коллекцию второго типа)
fun <T, R> combineAndTransform(
    collection1: Collection<T>,
    collection2: Collection<T>,
    transform: (T, T) -> R
): List<R> {
    val size = minOf(collection1.size, collection2.size)
    val result = mutableListOf<R>()

    for (i in 0 until size) {
        val element1 = collection1.elementAt(i)
        val element2 = collection2.elementAt(i)
        result.add(transform(element1, element2))
    }

    return result
}

