package com.abankin.y.kotlincourse.lesson15.homework

object Moon{

     var isVisible: Boolean = false
     var  phase: String = "New Moon"

    fun showPhase(){

        if (isVisible) {println("Луна видна и она в фазе $phase")}
        else {println("Луна не видна")}

    }


}