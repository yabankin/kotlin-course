package com.abankin.y.kotlincourse.lesson32.homework

class PhoneNumberFormatter {
    fun formatPhoneNumber(input: String): String {
        val cleanedInput = input.replace("\\D".toRegex(), "")

        if (cleanedInput.length !in 10..11) throw IllegalArgumentException("Некорректное количество символов")

        val number = if (cleanedInput.length == 10) {
            "7$cleanedInput"
        } else {
            if (cleanedInput.startsWith('8')) {
                "7${cleanedInput.substring(1)}"
            } else {
                cleanedInput
            }
        }

        if (!number.startsWith("7")) throw IllegalArgumentException("Некорректное начало номера")

        val formatted = "+7 (${number.substring(1, 4)}) ${number.substring(4, 7)}-${number.substring(7, 9)}-${number.substring(9, 11)}"

        return formatted
    }
}


