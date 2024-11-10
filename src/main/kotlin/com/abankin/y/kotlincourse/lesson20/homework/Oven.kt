package com.abankin.y.kotlincourse.lesson20.homework

class Oven : `Temp&Open`() {
    private var isOn = false
    override val maxTemperature = 250

    override fun powerOn() {
        super.powerOn()
        isOn = true
    }

    override fun powerOff() {
        super.powerOff()
        isOn = false
    }

    override fun programAction(action: String) {
        if (isOn) {super.programAction(action)}
        else{
            println("Устройство выключено, программирование невозможно")
        }
    }

    override fun execute() {
        if (isOn) {super.execute()}
        else{println("Устройство выключено, выполнение невозможно")}
    }

    override fun setTemperature(temp: Int) {
        if (isOn && temp <= maxTemperature) {println("Установлена температура: $temp")}
        else if (temp > maxTemperature){println("Температура выше предела")}
        else {println("Устройство выключено, установка температуры невозможна")}
    }

}