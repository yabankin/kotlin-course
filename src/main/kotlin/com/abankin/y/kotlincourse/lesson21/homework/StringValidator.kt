package com.abankin.y.kotlincourse.lesson21.homework

class StringValidator : Validator<String?> {
    override fun isValid(element: String?): Boolean {
         return !element.isNullOrBlank()
    }

}