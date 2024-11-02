package com.abankin.y.kotlincourse.lesson18.homework

class Dog : Animal() {
    override fun makeSound() {
        printColored("Bark!", Color.RED, Background.BLACK)
    }
}