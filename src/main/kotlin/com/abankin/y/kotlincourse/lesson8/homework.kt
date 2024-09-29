package com.abankin.y.kotlincourse.lesson8

fun main(){

    println(modifyPhrase("Этот код работает без проблем"))
    println("--------------------------")
    dateFromLog("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    println("--------------------------")
    creditCardMask("4539 1488 0343 6467")
    println("--------------------------")
    email("y.abankin@gmail.com")
    println("--------------------------")
    println(fileName("C:/Пользователи/Документы/report.txt"))
    println("--------------------------")
    println(abbreviation("Трэш-угарное Домашнее_задание"))
    println("--------------------------")
    println(abbreviation2("однажды в студЁную-зИмнЮЮ пору_я из лЕса вышел-был сИльНЫй МОРОз"))
    println("--------------------------")
    println(encrypt("Парадокс"))
    println("--------------------------")
    println(decrypt("аПародск"))
    println("--------------------------")
    mTable(20)
    println("--------------------------")
}

//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным.
//Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
//Примеры Тестовых Фраз:
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"
fun modifyPhrase(phrase: String): String {

    var phraseModified = ""


    // Проверка на "невозможно"
    if (phrase.contains("невозможно", ignoreCase = true)) {
        phraseModified = phrase.replace("невозможно", "совершенно точно возможно, просто требует времени", ignoreCase = true)
    }

    // Проверка, если фраза начинается с "Я не уверен"
    if (phrase.startsWith("Я не уверен", ignoreCase = true)) {
        phraseModified = "$phrase, но моя интуиция говорит об обратном"
    }

    // Проверка на "катастрофа"
    if (phrase.contains("катастрофа", ignoreCase = true)) {
        phraseModified = phrase.replace("катастрофа", "интересное событие", ignoreCase = true)
    }

    // Проверка, если фраза заканчивается на "без проблем"
    if (phrase.endsWith("без проблем", ignoreCase = true)) {
        phraseModified = phrase.removeSuffix("без проблем") + " с парой интересных вызовов на пути"
    }

    // Проверка, если фраза состоит только из одного слова
    if (phrase.split(" ").size == 1) {
        phraseModified = "Иногда, ${phrase.lowercase()}, но не всегда"
    }

    return phraseModified
}

//У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
fun dateFromLog(log: String){
    val dateTime = log.substringAfter("->").trim()
    val (date, time) = dateTime.split(" ")
    println("Дата: $date")
    println("Время: $time")
}

//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun creditCardMask(cc: String) {
    val mask = "*".repeat(cc.length - 4)
    val cardMask = mask + cc.substring(14).trim()
    println(cardMask)
}

//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".
fun email(mailbox: String) {
    val mailboxModify = mailbox.replace("@", " [at] ").replace(".", " [dot] ")
    println(mailboxModify)
}

//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
fun fileName(path: String): String{
    return path.substringAfterLast('/')
}

//Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").
fun abbreviation(phrase: String): String{
    var abbr = ""
    val words = phrase.split(" ", "-", "_")
    for (i in words) {
        if (i.isNotEmpty()) {
            abbr += i.first().uppercase()
        }
    }
    return abbr
}

//Написать метод, который преобразует строку из нескольких слов в строку, где каждое слово начинается с заглавной буквы а все остальные - строчные.
//(можно использовать такой же подход как в задании 5, но накапливать не первые буквы а целиком слова,
//составленные из первой буквы с uppercase и оставшейся части слова)
fun abbreviation2(phrase: String): String {
    var abbr = ""
    val words = phrase.split(" ", "-", "_")
    for (i in words) {
        if (i.isNotEmpty()) {
            val capitalizedWord = i.first().uppercase() + i.substring(1).lowercase()
            abbr += "$capitalizedWord "
        }
    }
    return abbr.trim()
}

//Написать шифратор/дешифратор для строки. Шифровка производится путём замены двух соседних букв между собой: Kotlin шифруется в oKltni.
//Дешифровка выполняется аналогично. Если длина строки - нечётная, в конец добавляется символ пробела до начала шифрования.
//Таким образом все шифрованные сообщения будут с чётной длинной.
//Должно получиться два публичных метода: encrypt() и decrypt() которые принимают и возвращают строку.
fun encrypt(text: String): String {
    // Добавляем пробел, если длина строки нечетная
    val text = if (text.length % 2 != 0) text + " " else text

    var result = ""

    // Проходим по строке парами символов и меняем их местами
    for (i in 0 until text.length step 2) {
        result += text[i + 1]  // Вторая буква
        result += text[i]      // Первая буква
    }
    return result
}

fun decrypt(text: String): String{
    var result = ""
    // Проходим по строке парами символов и меняем их обратно
    for (i in 0 until text.length step 2) {
        result += text[i + 1]  // Вторая буква
        result += text[i]      // Первая буква
    }
    return result.trim()
}

//Вывести таблицу умножения в консоль так, чтобы были ровные строки и столбцы. В заголовках столбцов и строк - числа для перемножения.
//В перекрестии - результат умножения. Каждый столбец должен быть выровнен по правому краю.
//Для печати результата в той же строке использовать print()
//Для перехода на следующую строку использовать println()
//Для выравнивания использовать функции форматирования строк с шаблоном (%s)
fun mTable(size: Int) {
    // Максимальная ширина столбца для форматирования
    val columnWidth = (size * size).toString().length
    // Печать заголовка
    print(" ".repeat(columnWidth + 1))  // Пробелы для выравнивания
    for (i in 1..size) {
        print("%${columnWidth}s ".format(i))
    }
    println()
    // Печать строки с результатами умножения
    for (i in 1..size) {
        print("%${columnWidth}s ".format(i))
        for (j in 1..size) {
            print("%${columnWidth}s ".format(i * j))
        }
        println()
    }
}