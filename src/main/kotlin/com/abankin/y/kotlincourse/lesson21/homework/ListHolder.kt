package com.abankin.y.kotlincourse.lesson21.homework

//Напишите класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления и получения всех элементов.
class ListHolder<T>() {
    var list: MutableList<T> = mutableListOf()

    fun addElement(element: T) {list += element}

    fun getElements(): List<T>{return list}

}