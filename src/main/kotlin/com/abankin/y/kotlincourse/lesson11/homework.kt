package com.abankin.y.kotlincourse.lesson11

fun main(){

    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val map1: Map<Int, Int> = mapOf()

    //Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map2 = mapOf(
        0.11f to 0.11,
        0.22f to 0.22,
        0.33f to 0.33
    )

    //Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val map3: MutableMap<Int, String> = mutableMapOf()

    //Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    map3[1] = "qwe"
    map3[2] = "asd"
    map3[3] = "zxc"

    //Используя словарь из предыдущего задания, извлеките значение, используя ключ.
    //Попробуй получить значение с ключом, которого в словаре нет.
    println("${map3[2]}\n${map3[999]}")
    println("---------------------")

    //Удалите определенный элемент из изменяемого словаря по его ключу.
    map3.remove(1)

    //Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
    //Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val map4 = mapOf(
        1.0 to 0,
        0.9 to 1,
        0.8 to 2,
        0.7 to 3,
        0.6 to 0
    )
    for ((key, value) in map4){
        if (value != 0) println(key / value)
            else println("бесконечность")
    }
    println("---------------------")

    //Измените значение для существующего ключа в изменяемом словаре.
    map3[3] = "GGG"
    println(map3)
    println("---------------------")

    //Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val map5 = mapOf(
        1 to "Один",
        2 to "Два",
        3 to "Три"
    )
    val map6 = mapOf(
        4 to "Четыре",
        5 to "Пять",
        6 to "Шесть"
    )
    val map7: MutableMap<Int, String> = mutableMapOf()
    for ((key, value) in map5) {
    map7[key] = value
    }
    for ((key, value) in map6) {
        map7[key] = value
    }
    println(map7)
    println("---------------------")

    //Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val map8: MutableMap<String, List<Int>> = mutableMapOf()
    map8["qwe"] = listOf(1,2,3,4)
    map8["asd"] = listOf(5,6,7,8)
    println(map8)
    println("---------------------")

    //Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
    //Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val map9: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    map9[1] = mutableSetOf("qwe","asd","zxc")
    map9[2] = mutableSetOf("123","456","789")
    println(map9[2])
    map9[2]?.add("xxx")
    println(map9[2])
    println("---------------------")

    //Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val map10 = mapOf(
        (1 to 1) to "qwe",
        (2 to 2) to "asd",
        (4 to 5) to "zxc",
        (5 to 5) to "rty",
    )
    for ((key, value ) in map10){
        if (key.first == 5 || key.second == 5) println(value)
    }

    //Ключи - автор книги, значения - список книг
    val map11: Map<String, MutableList<String>> = mapOf()

    //Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val map12: Map<String, List<String>> = mapOf()

    //Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val map13: Map<String, MutableMap<Int, String>> = mapOf()

    //Ключи - даты, значения - список препаратов принимаемых в дату
    val map14: MutableMap<String, MutableList<String>> = mutableMapOf()

    //Ключи - страны, значения - словари из городов со списком интересных мест.
    val map15: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf()


}