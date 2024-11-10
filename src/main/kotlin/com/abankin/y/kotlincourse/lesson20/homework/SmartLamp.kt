package com.abankin.y.kotlincourse.lesson20.homework

abstract class SmartLamp : Powerable, LightEmitting, Timable, Programmable, SoundEmitting, Rechargeable, AutomaticShutdown {
    override val sensorType: String = "Датчик уровня освещенности" // из AutomaticShutdown
    override val maxSensoredValue: Int = 1000  // макс освещенность из AutomaticShutdown
}