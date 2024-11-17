package com.abankin.y.kotlincourse.lesson22.homework.extensions

//Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы (но мы то знаем что слово только одно, но не будем его называть).
//Напиши метод расширения строки, который будет принимать список имён пользователей и выводить в консоли эту строку побуквенно в столбик:
//имя автора и букву под ним. Если сможешь повторить оригинальный шаблон вывода ответов с помощью похожих ASCII символов, будет очень круто

fun String.pidmarkoz(users: List<String>) {

    val numUsers = users.size

    for ((i, char) in this.withIndex()) {
        val user = users[i % numUsers]
        println("$user:\n $char")
    }
}