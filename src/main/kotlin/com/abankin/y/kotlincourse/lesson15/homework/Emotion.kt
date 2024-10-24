package com.abankin.y.kotlincourse.lesson15.homework

class Emotion(
    val type: String,
    val intensity: Int

)

{
    fun express(){
        println("Эмоция $type с интенсивностью $intensity")
    }

}