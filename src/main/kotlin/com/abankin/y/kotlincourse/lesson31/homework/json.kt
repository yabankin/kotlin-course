package com.abankin.y.kotlincourse.lesson31.homework

import com.abankin.y.kotlincourse.lesson30.CharacterTypes
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

data class Employee(
    val name: String,
    val status: Boolean,
    val dateOfBirth: String,
    val position: CharacterTypes,
    val subordinates: List<Employee?>?

)

val qa1 = Employee("qa1",true,"01.01.1981", CharacterTypes.QA,null)
val qa2 = Employee("qa2",true,"02.02.1982", CharacterTypes.QA,null)
val uxUi1 = Employee("uxUi1",true,"03.03.1983", CharacterTypes.UX_UI,null)
val uxUi2 = Employee("uxUi2",true,"04.04.1984", CharacterTypes.UX_UI,null)
val backEndDev1 = Employee("backEndDev1",true,"05.05.1985", CharacterTypes.BACKEND_DEV,null)
val backEndDev2 = Employee("backEndDev2",true,"06.06.1986", CharacterTypes.BACKEND_DEV,null)
val teamLead1 = Employee("teamLead1", true,"07.07.1987", CharacterTypes.TEAM_LEAD, listOf(qa1, uxUi1, backEndDev1))
val teamLead2 = Employee("teamLead2", true,"08.08.1988", CharacterTypes.TEAM_LEAD, listOf(qa2, uxUi2, backEndDev2))
val cto = Employee("cto", true,"09.09.1989", CharacterTypes.CTO, listOf(teamLead1, teamLead2))

fun main() {

    val gson = GsonBuilder().setPrettyPrinting().serializeNulls().create()
    val ctoJson = gson.toJson(cto)
    println(ctoJson)
    val ctoJsonFile = File("cto.json")
    ctoJsonFile.writeText(ctoJson)
    val ctoFromJson = ctoJsonFile.readText()
    val ctoFromJsonToEmployee = gson.fromJson(ctoFromJson, Employee::class.java)
    println(ctoFromJsonToEmployee)


}

