package com.abankin.y.kotlincourse.lesson17.homework

class ToBottom() : Materials() {

    fun addMaterialToBottom(material: String) {
        val currentMaterials = extractMaterial().toMutableList()
        currentMaterials.add(0, material)
        currentMaterials.forEach { addMaterial(it) }
    }
}