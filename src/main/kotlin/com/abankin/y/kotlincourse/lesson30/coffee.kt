package com.abankin.y.kotlincourse.lesson30

enum class CoffeeType(
    val cost: Double,
    val coffeeBase: String,
    val recommendedSugar: Int,
    val hasMilk: Boolean = false
) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0),
    NESCAFE_CLASSIC(1.50, "Nescafe Classic", 1);

    fun description() =
        "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}

enum class CharacterTypes(val recommendedCoffee: CoffeeType) {
    CTO(CoffeeType.ESPRESSO),
    UX_UI(CoffeeType.LATTE),
    CRM(CoffeeType.CAPPUCCINO),
    GAME_DEV(CoffeeType.LATTE),
    TEAM_LEAD(CoffeeType.ESPRESSO),
    BACKEND_DEV(CoffeeType.AMERICANO),
    PM(CoffeeType.CAPPUCCINO),
    SYSADMIN(CoffeeType.AMERICANO),
    QA(CoffeeType.NESCAFE_CLASSIC)
}

fun recommendCoffee(characterType: CharacterTypes): CoffeeType {
    return characterType.recommendedCoffee
}

fun main() {
    val character = CharacterTypes.CTO
    val recommendedCoffee = recommendCoffee(character)
    println("Recommended coffee for ${character.name}: ${recommendedCoffee.description()}")

    val qaCharacter = CharacterTypes.QA
    val qaRecommendedCoffee = recommendCoffee(qaCharacter)
    println("Recommended coffee for ${qaCharacter.name}: ${qaRecommendedCoffee.description()}")
}
