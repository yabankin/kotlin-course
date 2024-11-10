package com.abankin.y.kotlincourse.lesson19.homework

fun main(){

    val test = ChildrenClass("private", "protected", "public")
    test.publicField = "Антонио Бандерас"
    test.printText()
    test.modifyProtected("Antonio Banderas")
    test.setPrivateField("Bantonio Anderas")
    println(test.getAll())

}