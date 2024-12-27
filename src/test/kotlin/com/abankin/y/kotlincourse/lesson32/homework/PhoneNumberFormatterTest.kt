package com.abankin.y.kotlincourse.lesson32.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class PhoneNumberFormatterTest {

 private val formatter = PhoneNumberFormatter()

 companion object {
  @JvmStatic
  fun validPhoneNumbers(): List<Array<Any>> = listOf(
   arrayOf("8 (922) 941-11-11", "+7 (922) 941-11-11"),
   arrayOf("79229411111", "+7 (922) 941-11-11"),
   arrayOf("+7 922 941 11 11", "+7 (922) 941-11-11"),
   arrayOf("9229411111", "+7 (922) 941-11-11"),
   arrayOf("abc +7 922 941 11 11", "+7 (922) 941-11-11")
  )

  @JvmStatic
  fun invalidPhoneNumbers(): List<String> = listOf(
   "12345",
   "+1 (922) 941-11-11"
  )
 }

 @ParameterizedTest
 @MethodSource("validPhoneNumbers")
 fun `test valid phone numbers`(input: String, expected: String) {
  assertEquals(expected, formatter.formatPhoneNumber(input))
 }

 @ParameterizedTest
 @MethodSource("invalidPhoneNumbers")
 fun `test invalid phone numbers`(input: String) {
  assertThrows(IllegalArgumentException::class.java) {
   formatter.formatPhoneNumber(input)
  }
 }
}
