package com.abankin.y.kotlincourse.lesson20.homework

abstract class RobotCleaner : Powerable, Movable, Cleanable, Rechargeable, Drainable, Programmable, AutomaticShutdown, SoundEmitting {
    override val sensorType = "Датчик заполненности контейнера" // из AutomaticShutdown
    override val maxSensoredValue = 100 // из AutomaticShutdown
}