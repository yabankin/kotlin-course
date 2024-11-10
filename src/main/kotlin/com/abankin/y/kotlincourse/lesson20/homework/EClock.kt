package com.abankin.y.kotlincourse.lesson20.homework

import java.util.Date

abstract class EClock : Powerable, Timable, LightEmitting, SoundEmitting, BatteryOperated, Programmable {
  var date = Date() // дата
  var time = Date().time //время
  var isAlarm = false //будильник
}