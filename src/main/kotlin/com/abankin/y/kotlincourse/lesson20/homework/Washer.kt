package com.abankin.y.kotlincourse.lesson20.homework

abstract class Washer : Powerable, WaterConnection, Drainable, TemperatureRegulatable, Cleanable, Timable, Programmable, Openable, AutomaticShutdown {
    override val maxTemperature: Int = 90       // макс температура стирки из TemperatureRegulatable
    override val sensorType: String = "Датчик уровня воды" // из AutomaticShutdown
    override val maxSensoredValue: Int = 99    //макс вес белья из AutomaticShutdown
}