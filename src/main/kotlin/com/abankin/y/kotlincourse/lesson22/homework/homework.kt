package com.abankin.y.kotlincourse.lesson22.homework

import com.abankin.y.kotlincourse.lesson22.homework.extensions.longExt
import com.abankin.y.kotlincourse.lesson22.homework.extensions.revert
import com.abankin.y.kotlincourse.lesson22.homework.extensions.arrayExt
import com.abankin.y.kotlincourse.lesson22.homework.extensions.charExt
import com.abankin.y.kotlincourse.lesson22.homework.extensions.decrypt
import com.abankin.y.kotlincourse.lesson22.homework.extensions.encrypt
import com.abankin.y.kotlincourse.lesson22.homework.extensions.mapExt
import com.abankin.y.kotlincourse.lesson22.homework.extensions.mutableListExt
import com.abankin.y.kotlincourse.lesson22.homework.extensions.pidmarkoz
import com.abankin.y.kotlincourse.lesson22.homework.extensions.within

fun main(){

    val array = arrayOf(1,2,3,4,5)
    println(array.arrayExt())
    val char = '%'
    char.charExt(1,2,true)
    val list = mutableListOf(1,2,3)
    println(list.mutableListExt(null,2.0))
    val map = mapOf(
        1 to listOf(1, 2, 3),
        2 to listOf(4, 5),
        3 to listOf(6,null,8,9))
    println(map.mapExt(1))
    val long = 7548758375983745897L
    println(long.longExt())
    val pair = 1 to "first"
    val pair2 = 4.0 to null
    val pair3 = null to 4f
    println(pair.revert())
    println(pair2.revert())
    println(pair3.revert())
    val number = 4f
    println(number.within(7, 6))
    val text = "Пидмаркоз"
    println(text)
    val encryptedText = text.encrypt(4)
    println(encryptedText)
    val decryptedText = encryptedText.decrypt(4)
    println(decryptedText)
    val users = listOf("User1", "User2", "User3")
    val word = "Пидмаркоз"
    word.pidmarkoz(users)

}

