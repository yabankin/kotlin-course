package com.abankin.y.kotlincourse.lesson17.homework

fun main(){

    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val bottomContainer = ToBottom()
    ordinalNumbers.forEach { bottomContainer.addMaterial(it) }
    bottomContainer.addMaterialToBottom("bottom_element")
    bottomContainer.printContainer()

    println("--------------------------------------------------")

    val listContainer = MaterialsList()
    ordinalNumbers.forEach { listContainer.addMaterial(it) }
    val list = listOf("qwe","asd", "zxc")
    listContainer.insertList(list)
    listContainer.printContainer()

    println("--------------------------------------------------")

    val aToZContainer = FromAToZ()
    ordinalNumbers.forEach { aToZContainer.addMaterial(it) }
    aToZContainer.addAToZ("geeeetenth")
    aToZContainer.printContainer()

    println("--------------------------------------------------")

    val pairsContainer = AddPairs()
    ordinalNumbers.forEach { pairsContainer.addMaterial(it) }
    pairsContainer.addPair(mapOf("1" to "100", "2" to "200"))
    pairsContainer.printContainer()


}