package com.abankin.y.kotlincourse.lesson13

fun main() {

    val collectionInt = listOf(1,1,2,3,3,4,10,20,30,40)
    val collectionText = listOf("qwe", "rty", "asd", "qwerty")
    val collection: List<Int> = listOf(3,14,100,200,300,5000,90000)
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка",
        "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val ages = listOf(22, 18, 30, 45, 17, null, 60)


    //------------------------------------------------------------------------------------------------------------------
    //Проверить, что размер коллекции больше 5 элементов
    if (collectionInt.size > 5) println("В коллекции больше 5 элементов") else println{("В коллекции меньше 5 элементов") }
    //Проверить, что коллекция пустая
    if (collectionInt.isEmpty()) {println("Коллекция пустая")} else { println("Коллекция непустая") }
    //Проверить, что коллекция не пустая
    if (collectionInt.isNotEmpty()) {println("Коллекция непустая")} else { println("Коллекция пустая") }
    //Взять элемент по индексу или создать значение, если индекса не существует
    val element = collectionInt.getOrElse(10) {1024}
    println(element)
    //Собрать коллекцию в строку
    val string = collectionInt.joinToString(separator = ":" )
    println(string)
    //Посчитать сумму всех значений (если коллекция содержит числовые значения)
    val sum = collectionInt.sum()
    println(sum)
    //Посчитать среднее значение
    val average = collectionInt.average()
    println(average)
    //Взять максимальное число
    val max = collectionInt.max()
    println(max)
    //Взять минимальное число
    val min = collectionInt.min()
    println(min)
    //Взять первое число или null
    val fistOrNull = collectionInt.firstOrNull()
    println(fistOrNull)
    //Проверить, что коллекция содержит элемент
    val isIn = collectionInt.contains(11)
    println(isIn)

    //------------------------------------------------------------------------------------------------------------------

    //Отфильтровать коллекцию по диапазону 18-30
    val filter = collectionInt.filter { it in 18..30 }
    println(filter)
    //Выбрать числа, которые не делятся на 2 и 3 одновременно
    val twoAndThree = collectionInt.filter { it % 2 != 0 && it % 3 !=0 }
    println(twoAndThree)
    //Очистить текстовую коллекцию от null элементов
    val withOutNull = collectionText.filterNot { it == null }
    println(withOutNull)
    //Преобразовать текстовую коллекцию в коллекцию длин слов
    val wordLength = collectionText.map { it?.length }
    println(wordLength)
    //Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    val map1 = collectionText.associate { it to it?.reversed() }
    println(map1)
    //Отсортировать список в алфавитном порядке
    val sort1 = collectionText.sorted()
    println(sort1)
    //Отсортировать список по убыванию
    val sort2 = collectionText.sortedDescending()
    println(sort2)
    //Распечатать квадраты элементов списка
    collectionInt.forEach { println(it * it) }
    //Группировать список по первой букве слов
    val sort3 = collectionText.groupBy { it.first() }
    println(sort3)
    //Очистить список от дублей
    val sort4 = collectionInt.distinct()
    println(sort4)
    //Взять первые 3 элемента списка
    val first3 = collectionInt.take(3)
    println(first3)
    //Взять последние 3 элемента списка
    val last3 = collectionInt.takeLast(3)
    println(last3)

//------------------------------------------------------------------------------------------------------------------

    println(collectionStatus(collection))
    gradesFilter(grades)
    catalog(list)
    wordsToLetters(list)
    uniqueNum(numbers)
    correctElement(ages)

}

//Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when
fun collectionStatus(collection: List<Int>): String {
        return when {
            collection.isEmpty() -> "Пусто"
            collection.size < 5 -> "Короткая"
            collection.firstOrNull() == 0 -> "Стартовая"
            collection.sum() > 10000 -> "Массивная"
            collection.average() == 10.0 -> "Сбалансированная"
            collection.joinToString("").length > 20 -> "Клейкая"
            collection.max() < 10 -> "Отрицательная"
            collection.min() > 1000 -> "Положительная"
            collection.contains(3) && collection.contains(14) -> "3.14здатая"
            else -> "Уникальная"
        }

}

//Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3
fun gradesFilter(grades: List<Int>){
    val filterGrades = grades.filter { it >= 60 }.sorted().take(3)
    println(filterGrades)
}

//Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве
fun catalog(list: List<String>) {
    val listCatalog = list.map{it.lowercase()}.groupBy { it.first() }.toSortedMap()
    println(listCatalog)
}

//Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с двумя знаками после запятой.
fun wordsToLetters(list: List<String>){
    val letters = list.map { it.length }.average()
    println("%.2f".format(letters))
}

//Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”)
fun uniqueNum(numbers: List<Int>){
    val unique = numbers.distinct().sortedDescending().groupBy { if (it % 2 == 0) "четные" else "нечетные"  }
    println(unique)
}

//Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".
fun correctElement(ages: List<Int?>) {
    val element = ages.firstOrNull { it!! > 18 }?.toString()
    if (element != null) println(element)
    else println("Подходящий возраст не найден")

}
