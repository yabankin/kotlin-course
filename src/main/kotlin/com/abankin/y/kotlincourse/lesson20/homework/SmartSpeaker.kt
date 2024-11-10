package com.abankin.y.kotlincourse.lesson20.homework

abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable, Rechargeable, BatteryOperated {
    var volumeLevel: Int = 50
    var connectionType = "Bluetooth"
    var batteryLevel: Double = 100.0
}