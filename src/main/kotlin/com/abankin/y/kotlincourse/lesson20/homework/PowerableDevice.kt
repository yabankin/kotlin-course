package com.abankin.y.kotlincourse.lesson20.homework

abstract class PowerableDevice: Powerable {
    override fun powerOn() {
        println("Устройство включено")
    }

    override fun powerOff() {
        println("Устройство выключено")
    }
}
