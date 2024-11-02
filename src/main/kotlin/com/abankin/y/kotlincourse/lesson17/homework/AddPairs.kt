package com.abankin.y.kotlincourse.lesson17.homework

class AddPairs : Materials() {

    fun addPair(pairs: Map<String, String>) {

        pairs.forEach { (key, value) ->
            val currentMaterials = extractMaterial().toMutableList()
            currentMaterials.add(0, key)
            currentMaterials.add(value)
            currentMaterials.forEach { addMaterial(it) }
        }
    }
}