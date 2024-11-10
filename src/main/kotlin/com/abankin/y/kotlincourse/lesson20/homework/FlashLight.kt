package com.abankin.y.kotlincourse.lesson20.homework

abstract class FlashLight: Powerable, Openable, BatteryOperated, LightEmitting, Rechargeable, AutomaticShutdown {
    override val sensorType = "Датчик заряда батареи" // из AutomaticShutdown
    override val maxSensoredValue = 5 // из AutomaticShutdown
    var level = 50
}