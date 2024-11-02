package com.abankin.y.kotlincourse.lesson18.homework

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = splitText(text)
        for (word in words){
            printColored(word, Color.BLACK, Background.WHITE)
        }
    }
}
