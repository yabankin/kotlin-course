package com.abankin.y.kotlincourse.lesson19.homework

class GameMachine(
    val color: String,
    val model: String,
    private var isOn: Boolean = false,
    private var OSLoad: Boolean = false,
    private val listOfGames: List<String>,
    val isJoystick: Boolean,
    private var balance: Double = 0.0,
    val owner: String,
    val supportPhone: String
    ) {

        fun powerOn() {isOn = true}

        fun powerOff() {isOn = false}

        private fun loadOS() {println ("OS load")}

        private fun unloadOS() {println("OS unload") }

        fun showGames(): List<String> {return listOfGames}

        fun gameOn(name: String): Boolean {return listOfGames.contains(name)}

        fun pay(amount: Double) {balance += amount}

        private fun cashOut(amount: Double): Boolean {
            return if (balance >= amount) {
                balance -= amount
                true
            } else {false}
        }

        private fun getPrize(amount: Double): Boolean {
            return cashOut(amount)
        }
    }