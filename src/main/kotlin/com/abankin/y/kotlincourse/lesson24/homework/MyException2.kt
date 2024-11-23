package com.abankin.y.kotlincourse.lesson24.homework

class MyException2(cause: ArrayIndexOutOfBoundsException): RuntimeException("MyError2", cause) {
}