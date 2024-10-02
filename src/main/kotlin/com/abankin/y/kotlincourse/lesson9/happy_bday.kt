package com.abankin.y.kotlincourse.lesson9

fun main() {
    val wishes = listOf(
        "здоровья",
        "счастья",
        "успехов",
        "профессионального роста",
        "исполнения желаний",
        "много радостных моментов"
    )

    val name = "Саша"
    val message = happyBirthday(name, wishes)
    println(message)
}

fun happyBirthday(name: String, wishes: List<String>): String {
    var message = "$name!\n\nПоздравляю тебя с Днем рождения!\n\n"

    for ((index, wish) in wishes.withIndex()) {
        message += "Желаю тебе $wish"
        if (index != wishes.lastIndex) {
            message += ",\n"
        } else {
            message += "!\n\n" //
        }
    }

    message += "Пусть этот день будет наполнен незабываемыми впечатлениями и яркими эмоциями!\n\n"
    message += "С наилучшими пожеланиями, y.abankin"

    return message
}