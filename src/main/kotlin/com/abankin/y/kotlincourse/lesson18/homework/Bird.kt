package com.abankin.y.kotlincourse.lesson18.homework

class Bird : Animal() {
    override fun makeSound() {
        printColored("Tweet!", Color.GREEN, Background.BLACK)
    }
}