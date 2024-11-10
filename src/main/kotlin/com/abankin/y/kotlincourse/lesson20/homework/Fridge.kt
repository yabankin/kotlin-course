package com.abankin.y.kotlincourse.lesson20.homework

abstract class Fridge : Powerable, TemperatureRegulatable, Cleanable, AutomaticShutdown {
    override val maxTemperature: Int = 10  // макс температура работы из интерфейса TemperatureRegulatable
    override val sensorType: String = "Температурный датчик"  // из AutomaticShutdown
    override val maxSensoredValue: Int = 50  //из AutomaticShutdown
}