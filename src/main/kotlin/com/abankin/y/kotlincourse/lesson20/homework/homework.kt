package com.abankin.y.kotlincourse.lesson20.homework


fun main(){

println("-----------Холодильник---------------")
    val fridge = FrigdeUnit()
    fridge.setTemperature(11)
    fridge.powerOn()
    fridge.programAction("Шоковая заморозка")
    fridge.execute()

println("-----------Стиральная машина---------------")
    val washer = WasherUnit()
    washer.powerOn()
    washer.getWater(5)
    washer.clean()
    washer.drain()
    washer.powerOff()
    washer.programAction("Отжим")

println("-----------Духовка---------------")
    val oven = Oven()
    oven.setTemperature(300)
    oven.setTemperature(200)
    oven.powerOn()
    oven.setTemperature(201)
    oven.powerOff()

println("-----------Чайник---------------")
    val kettle = Kettle()
    kettle.powerOn()
    kettle.setTimer(2)
    kettle.execute()
    kettle.open()

}
