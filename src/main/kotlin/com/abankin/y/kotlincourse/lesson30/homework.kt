package com.abankin.y.kotlincourse.lesson30

enum class TestStatus(val status: String) {
    PASS("pass"),
    BROKEN("broken"),
    FAILURE("failure")
}

enum class PropertyType(val code: String, val description: String) {
    APARTMENT("apartment", "Квартира"),
    HOUSE("house", "Дом"),
    STUDIO("studio", "Студия"),
    TOWNHOUSE("townhouse", "Таунхаус")
}

enum class Planet(val distanceFromSun: Double, val mass: Double) {
    MERCURY(0.39, 3.3011e23),
    VENUS(0.72, 4.8675e24),
    EARTH(1.00, 5.97237e24),
    MARS(1.52, 6.4171e23),
    JUPITER(5.20, 1.8982e27),
    SATURN(9.58, 5.6834e26),
    URANUS(19.22, 8.6810e25),
    NEPTUNE(30.05, 1.02413e26)
}

fun sort() {
    PropertyType.entries.sortedBy { it.description.length }.forEach { println(it.description) }
}

fun test(action: () -> Unit): TestStatus {
    return try {
        action()
        TestStatus.PASS
    } catch (e: AssertionError) {
        TestStatus.FAILURE
    } catch (e: Exception) {
        TestStatus.BROKEN
    }
}

fun find(lambda: (Planet) -> Boolean): Planet {
    return Planet.entries.firstOrNull(lambda) ?: throw NoSuchElementException("Таких планет нет") }


fun main() {

    sort()

    val passLambda = { }
    val failureLambda = { throw AssertionError() }
    val brokenLambda = { throw RuntimeException() }
    println (test(passLambda))
    println(test(failureLambda))
    println(test(brokenLambda))

    val planetLambda1 = find { it.distanceFromSun >= 1 }
    println(planetLambda1.name)
    val planetLambda2 = find { it.mass > 8.1e24 }
    println(planetLambda2)
    val planetLambda3 = find { it.distanceFromSun > 100 }
    println(planetLambda3)


}