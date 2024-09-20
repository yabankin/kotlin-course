package com.abankin.y.kotlincourse.lesson5
fun main() {

    calculateIntensity(100.0, null)
    fullCargoCost(null)
    meteoMeasurement(null, 25.4, 15.0)

}

// Функция для расчета интенсивности звука после затухания
fun calculateIntensity(initialIntensity: Double, decayCoefficient: Double?) {
    println("Предполагаемая интенсивность звука после затухания: " + (initialIntensity * (decayCoefficient ?: 0.5)))
}

//Функция расчета полной стоимости доставки
fun fullCargoCost(cargoCost: Double?) {
    var insurance = (cargoCost ?: 50.0) / 200.0
    println("Полная стоимость доставки: " + ((cargoCost ?: 50.0) + insurance))

}

//Функция для метеоизмерений
fun meteoMeasurement(pressure: Int?, temperature: Double, humidity: Double) {
    println("Давление: " + (pressure ?: throw Exception("Ошибка! Отсутствие показаний атмосферного давления!")) +
            " Температура : " + temperature + " Влажность: " + humidity)
}