package com.abankin.y.kotlincourse.lesson17.homework

class FromAToZ : Materials() {

        fun addAToZ(material: String) {
            val currentMaterials = extractMaterial().toMutableList()
            currentMaterials.add(material)
            currentMaterials.sort()
            currentMaterials.forEach { addMaterial(it) }
        }
    }
