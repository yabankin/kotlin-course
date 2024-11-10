package com.abankin.y.kotlincourse.lesson20.homework

class WasherUnit : `Temp&Open`(), WaterConnection, Drainable, Cleanable, Timable, Openable, AutomaticShutdown  {
    private var isOn = false
    override val maxTemperature = 90
    override val sensorType = "Датчик уровня воды"
    override val maxSensoredValue = 99

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

    override fun connectToWaterSupply() {
        println("Подключено к источнику воды")
    }

    override fun getWater(amount: Int) {
        println("Залито $amount литров воды")
    }

    override fun connectToDrain() {
       println("Подключено к сливу")
    }

    override fun drain() {
        println("Вода слита")
    }

    override fun clean() {
        println("Включена самоочистка")
    }

    override fun setTimer(time: Int) {
        println("Установлен таймер на $time минут")
    }

    override fun startMonitoring() {
        println("Включен мониторинг датчиков")
    }

}