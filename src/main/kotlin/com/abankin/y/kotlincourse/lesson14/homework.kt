package com.abankin.y.kotlincourse.lesson14

fun main() {

    //Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val map1 = mapOf(
        "test1" to 10.0,
        "test2" to 19.0,
        "test3" to 3.0
    )
    println(map1.values.sum() / map1.keys.size)

    //Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
    //Выведите список всех тестовых методов.
    val map2 = mutableMapOf(
        "testMethod1" to "metaData1",
        "testMethod2" to "metaData2",
        "testMethod3" to "metaData3"
    )
    val testMethods = map2.keys.joinToString(",")
    println(testMethods)

    //В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    map2.put("testMethod4", "metaData4")
    println(map2)

    //Посчитайте количество успешных тестов в словаре с результатами.
    val map4 = mapOf(
        "test1" to true,
        "test2" to true,
        "test3" to false,
        "test4" to true
    )
    println(map4.values.count { it })

    //Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val map5 = mutableMapOf(
        "bug1" to "fixed",
        "bug2" to "unfixed",
        "bug3" to "unfixed"
    )
    map5.entries.removeIf { it.value == "fixed" }
    println(map5)

    //Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val map6 = mapOf(
        "http://url1" to "OK",
        "http://url2" to "OK",
        "http://url3" to "FORBIDDEN"
    )
    map6.forEach { (url, status) ->
        println("Страница: $url, Статус проверки: $status")
    }

    //Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val threshold = 5.0
    println(map1.filter { it.value > threshold })

    //В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
    //Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val map7 = mapOf(
        1 to "test ok",
        2 to "test ok",
        3 to "test failed"
    )
    println(map7.getOrDefault(10, "Endpoint не был протестирован"))

    //Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации), получите значение для "browserType".
    //Ответ не может быть null.
    val map8 = mutableMapOf(
        "osType" to "Windows",
        "browserType" to "Edge",
        "processor" to "Core Ultra"
    )
    val browser = map8.getValue("browserType")
    if (browser != null) {
        println(browser)
    } else {
        println("Тестирование без браузера невозможно")
    }

    //Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию
    val map9 = mapOf(
        "ver1.0" to "21.10.2024",
        "ver1.1" to "22.10.2024"
    )
    val map10 = map9.toMutableMap()
    map10.put("ver1.2", "23.10.2024")
    println(map10)

    //Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
    //получите настройки для конкретной модели или верните настройки по умолчанию
    val map11 = mapOf(
        "phone1" to "config1",
        "phone2" to "config2",
        "phone3" to "config3"
    )
    println(map11.getOrDefault("phone9", "iPhone"))

    //Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    val map12 = mapOf(
        1 to "error1",
        2 to "error2",
        3 to "error3"
    )
    val errorType = 10
    if (map12.containsKey(errorType)) {
        println("ошибка ${map12[errorType]}")
    } else println("ошибка не обнаружена")

    //Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
    //а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    //Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    val map13 = mutableMapOf(
        "TestID_Version01" to "Passed",
        "TestID_Version02" to "Failed",
        "TestID_Version03" to "Skipped"
    )
    println(map13.filterKeys { it == "TestID_Version01" })

    //У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
    //Проверьте, есть ли модули с неудачным тестированием.
    val map14 = mapOf(
        "Module1" to "passed",
        "Module2" to "failed",
        "Module3" to "passed",
        "Module4" to "passed"
    )
    val failedTest = map14.any({ it.value == "failed" })
    if (failedTest) {
        println("есть модули с неудачным тестированием")
    } else {
        println("все модули рабочие")
    }

    //Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    map8.putAll(map11)
    println(map8)

    //Объедините два неизменяемых словаря с данными о багах.
    val map15 = mapOf(
        1 to "bug1",
        2 to "bug2"
    )
    val map16 = mapOf(
        3 to "bug3",
        4 to "bug4"
    )
    val map17 = map15.plus(map16)
    println(map17)

    //Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val map18 = mutableMapOf(
        "test1" to "monday",
        "test2" to "wednesday",
        "test3" to "fiday"
    )
    map18.clear()
    println(map18)

    //Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
    println(map13.values.filterNot { it == "Skipped" })

    //Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    val map20 = mutableMapOf(
        "01.10.2024" to "config1",
        "10.10.2024" to "config2",
        "last" to "config3")
    map20.keys.removeIf { date -> date != "last" }
    println(map20)


    //Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
    //(ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val map21 = mutableMapOf(
        1 to "passed",
        2 to "failed",
        3 to "skipped")
    println(map21.map { (id, result) -> "$id : $result"})

    //Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации
    val map22 = map20.toMap()

    //Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
    //заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))
    val map23 = mutableMapOf(
        "1" to 100.0,
        "2" to 200.0,
        "3" to 300.0)
    val map24 = map23.mapKeys { (id) -> getNameById(id) }
    println(map24)

    //Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val map25 = mutableMapOf(
        "ver1" to 25.0,
        "ver2" to 30.0,
        "ver3" to 77.0)
    val map26 = map25.mapValues { (ver, score) -> score * 1.1 }
    println(map26)

    //Проверьте, пуст ли словарь с ошибками компиляции тестов.
    println(map26.isEmpty())

    //Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    println(map26.isNotEmpty())

    //Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами
    if (map21.values.all { it == "passed" }) println("все тесты прошли успешно")
    else {println("не все тесты прошли успешно")}

    //Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    if (map21.values.any { it == "failed" }) println("есть тесты с ошибками")
    else { println("ошибок в тестах нет") }

    //Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”
    val map27 = mutableMapOf(
        "test1optional" to "passed",
        "test2" to "failed",
        "test3optional" to "failed")
    val map28 = map27.filter { (testName, result) -> result == "failed" && testName.contains("optional")}
    println(map28)

}

fun getNameById(id: String): String {
    return when (id) {
        "1" -> "Test 1"
        "2" -> "Test 2"
        "3" -> "Test 3"
        else -> "Unknown Test"
    }
}