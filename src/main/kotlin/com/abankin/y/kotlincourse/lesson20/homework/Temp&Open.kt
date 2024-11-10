package com.abankin.y.kotlincourse.lesson20.homework

abstract class `Temp&Open`: TemperatureRegulatable, Openable, ProgrammableDevice() {
    override fun open() {
        println("Устройство открыто")
    }

    override fun close() {
        println("Устройство закрыто")
    }

    override fun setTemperature(temp: Int) {
        println("Установлена температура $temp")
    }

}