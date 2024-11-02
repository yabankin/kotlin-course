package com.abankin.y.kotlincourse.lesson17.homework

class MaterialsList() : Materials() {

    fun insertList(materials: List<String>) {
        val currentMaterials = extractMaterial().toMutableList()
        val insertedMaterials = mutableListOf<String>()

        val maxIndex = maxOf(materials.size, currentMaterials.size)

        for (i in 0 until maxIndex) {
            if (i < materials.size) insertedMaterials.add(materials[i]) // Четные позиции
            if (i < currentMaterials.size) insertedMaterials.add(currentMaterials[i]) // Нечетные позиции
        }

        // Возвращаем перемешанный список обратно в контейнер
        insertedMaterials.forEach { addMaterial(it) }
    }
}