package com.abankin.y.kotlincourse.lesson19.homework

    abstract class BaseClass(
        // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass:
        // в ChildrenClass оно определено независимо, это разные поля
        private val privateVal: String,

        // объясни, почему это поле недоступно в main()
        // у поля модификатор protected, доступ только из этого класса и из наследников
        protected val protectedVal: String,
        val publicVal: String
    ) {

        var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
                "Доработай ChildrenClass таким образом, чтобы это получилось"
            set(value) {
                if (verifyPublicField(value)) {
                    field = value
                }
            }

        protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
        private var privateField = "добавь сеттер чтобы изменить меня из main()"
        fun setPrivateField(value: String) {
            privateField = value
        }


        fun getAll(): String {
            return mapOf(
                "privateVal" to privateVal,
                "protectedVal" to protectedVal,
                "publicVal" to publicVal,
                "publicField" to publicField,
                "protectedField" to protectedField,
                "privateField" to privateField,
            ).map { "${it.key}: ${it.value}" }
                .joinToString("\n")
        }

        fun printText() {
            privatePrint()
        }

        //объясни, почему эта функция не может быть публичной
        //функция возвращает ProtectedClass, он объявлен как protected, доступен только из этого класса и наследников
        //публичной быть не может, чтобы возвращать protected
        protected open fun getProtectedClass() = ProtectedClass()

        protected open fun verifyPublicField(value: String): Boolean {
            return value.length < 3
        }

        private fun privatePrint() {
            println("Печать из класса BaseClass")
        }

        //объясни, почему эта функция не может быть публичной или protected
        //функция возвращает PrivateClass, он объявлен как private, доступен только из этого класса
        //если сделать публичной или protected - приватный класс станет доступен извне

        private fun getPrivateClass() = PrivateClass()

        protected class ProtectedClass

        private class PrivateClass
    }