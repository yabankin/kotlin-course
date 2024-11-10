package com.abankin.y.kotlincourse.lesson20.homework

abstract class ProgrammableDevice : Programmable, PowerableDevice() {
    private var programmedAction = "Нет действия для выполнения"

    override fun programAction(action: String) {
        programmedAction = action
        println("Запрограммировано: $action")
    }

    override fun execute() {
        println("Выполнено действие: $programmedAction")
    }

}
