package com.abankin.y.kotlincourse.lesson30

enum class Colors(val value: String) {
    RED_COLOR("\u001B[31m"),
    YELLOW_COLOR("\u001B[33m"),
    GREEN_COLOR("\u001B[32m"),
    RESET_COLOR("\u001B[0m")
}

const val LIGHT_SYMBOL = "\u25CF"

// Функция для отображения сигнала
fun showSignal(signal: TrafficLightSignal) {
    print("\r" + signal.color.value + LIGHT_SYMBOL + Colors.RESET_COLOR.value) // Выводим сигнал с возвратом каретки
}

fun clear() {
    print("\r    ")
}

enum class TrafficLightSignal(
    val color: Colors,
    val duration: Long,
    val blinkTimes: Int? = null
) {
    RED(Colors.RED_COLOR, 4000),
    YELLOW(Colors.YELLOW_COLOR, 2000),
    GREEN(Colors.GREEN_COLOR, 4000),
    BLINKING_GREEN(Colors.GREEN_COLOR, 300, 4)
}

fun main() {
    while (true) {
        for (signal in TrafficLightSignal.entries) {
            if (signal.blinkTimes == null) {
                showSignal(signal)
                Thread.sleep(signal.duration)
            } else {
                repeat(signal.blinkTimes) {
                    showSignal(signal)
                    Thread.sleep(signal.duration)
                    clear()
                    Thread.sleep(signal.duration) }
            }
        }
    }
}