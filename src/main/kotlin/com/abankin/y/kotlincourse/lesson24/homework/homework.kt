package com.abankin.y.kotlincourse.lesson24.homework

fun main() {

    try {
        val i1 = null
        i1!!
        val i2 = listOf(1, 2)
        i2[5]
        val i3 = "string" as Boolean
        val i4 = "123,00".toDouble()
        println(i4)
        argument(-1)
        state(-1)
        stack()
        memory()

    } catch (e: NullPointerException) {
        println("NullPointerException")
    } catch (e: ArrayIndexOutOfBoundsException){
        println("ArrayIndexOutOfBoundsException")
    } catch (e: ClassCastException){
        println("ClassCastException")
    } catch (e: NumberFormatException){
        println("NumberFormatException")
    } catch (e: IllegalArgumentException){
        println("IllegalArgumentException")
    } catch (e: IllegalStateException){
        println("IllegalStateException")
    } catch (e: OutOfMemoryError){
        println("OutOfMemoryError")
    } catch (e: StackOverflowError){
        println("StackOverflowError")

    } catch (e: Throwable){
        when (e){
            is NullPointerException -> println("NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("ClassCastException")
            is NumberFormatException -> println("NumberFormatException")
            is IllegalStateException -> println("IllegalStateException")
            is IllegalArgumentException -> println("IllegalArgumentException")
            is OutOfMemoryError -> println("OutOfMemoryError")
            is StackOverflowError -> println("StackOverflowError")
        }
    }

    throw MyException("MyError")

    try {
        val i5 = listOf(1, 2, 3, 4, 5)
        i5[10]
    } catch (e: ArrayIndexOutOfBoundsException) {
        throw MyException2(e)
    }

}

fun argument(arg: Int) {
    require(arg >= 0) {
        "Arg could not be negative"
    }
}

fun state(arg: Int) {
    check(arg >= 0) {
        "Arg could not be negative"
    }
}

fun stack() {
    stack()
}

fun memory() {
    val list = mutableListOf("")
    while (true) {
        list.add("00000000000000000000000000000000000000000000000000000000000000")
    }
}