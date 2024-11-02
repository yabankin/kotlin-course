package com.abankin.y.kotlincourse.lesson18.homework

class Logger {

    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(type: String, message: String) {
         when (type) {
             "WARNING" -> printColored("$type: $message", Color.YELLOW, Background.BLACK)
             "ERROR" -> printColored("$type: $message", Color.RED, Background.BLACK)
             "DEBUG" -> printColored("$type: $message", Color.GREEN, Background.BLACK)
         }

    }

    fun log(message: List<String>) {
        for (mes in message){
            println("INFO: $mes")
        }
    }

    fun log(message: Exception){
        printColored("ERROR: ${message.message}", Color.RED, Background.BLUE)
    }
}