package com.abankin.y.kotlincourse.lesson20.homework

class Kettle : `Temp&Open`(), AutomaticShutdown, Timable {
    private var isOn = false
    override val maxTemperature = 100
    override val sensorType = "Датчик температуры"
    override val maxSensoredValue = 100

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



    override fun startMonitoring() {
        println("Включен мониторинг датчиков")
    }

    override fun setTimer(time: Int) {
        println("Установлен таймер на $time минут")
    }

}