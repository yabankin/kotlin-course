package com.abankin.y.kotlincourse.lesson18.homework

class InkjetPrinter () : Printer(
){
    private val colorPairs = listOf(
        Pair(Color.RED, Background.YELLOW),
        Pair(Color.GREEN, Background.BLUE),
        Pair(Color.YELLOW, Background.RED),
        Pair(Color.BLUE, Background.GREEN),
        Pair(Color.PURPLE, Background.WHITE)
    )

    override fun print(text: String) {
        val words = splitText(text)
        var colorIndex = 0
        for (word in words) {
            val (textColor, backgroundColor) = colorPairs[colorIndex % colorPairs.size]
            printColored(word, textColor, backgroundColor)
            colorIndex++
        }
    }
}