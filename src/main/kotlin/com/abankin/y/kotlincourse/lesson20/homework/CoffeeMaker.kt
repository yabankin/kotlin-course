package com.abankin.y.kotlincourse.lesson20.homework

abstract class CoffeeMaker: Powerable, Openable, WaterContainer, TemperatureRegulatable, WaterConnection, Drainable, Timable, LightEmitting,
SoundEmitting, Programmable, Cleanable {
    override val capacity = 5 // 5 литров контейнер воды из WaterContainer
    override val maxTemperature = 80 // макс температура из TemperatureRegulatable
}