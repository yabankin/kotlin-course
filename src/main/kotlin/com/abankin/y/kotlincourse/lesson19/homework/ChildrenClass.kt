package com.abankin.y.kotlincourse.lesson19.homework

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    //объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    //в BaseClass этот аргумент объявлен публичным
    publicVal: String


) : BaseClass(privateVal, protectedVal, privateVal) {

    //объясни, почему в main() доступна функция getAll() хотя её здесь нет
    //функция в BaseClass объявлена публичной, доступна не только в наследнике, но и извне

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun modifyProtected(text: String) {
        protectedField = text
    }

}
