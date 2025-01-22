package com.abankin.y.kotlincourse.lesson31.homework

import kotlin.math.max
import kotlin.math.min

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {

    init {
        // Проверка на отрицательное значение ёмкости контейнера
        require(containerCapacity >= 0) { "Ёмкость контейнера не может быть отрицательной" }
        // Проверка, что ёмкость хранилища не меньше ёмкости одного контейнера
        require(storageCapacity >= containerCapacity) { "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера" }
    }

    // Хранилище для круп, где ключ - тип крупы, а значение - количество
    private val storage = mutableMapOf<Cereal, Float>()

    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }

        val currentAmount = getAmount(cereal) // Используем метод getAmount
        val totalAmount = currentAmount + amount
        val newAmount = min(containerCapacity, totalAmount)
        val remainingAmount = max(0f, totalAmount - containerCapacity)

        storage[cereal] = newAmount
        return remainingAmount
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        // Проверка на отрицательное количество крупы
        require(amount >= 0) { "Количество не может быть отрицательным" }

        val currentAmount = storage[cereal] ?: 0f // Текущее количество крупы в контейнере
        val takenAmount = if (currentAmount >= amount) amount else currentAmount // Сколько можно взять
        storage[cereal] = currentAmount - takenAmount // Обновляем количество в контейнере
        return takenAmount // Возвращаем количество взятой крупы
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        // Проверка, пуст ли контейнер
        if (getAmount(cereal) == 0f) {
            storage.remove(cereal) // Удаление контейнера
            return true // Контейнер удален
        }
        return false // Контейнер не пуст и не удален
    }

    override fun getAmount(cereal: Cereal): Float {
        return storage[cereal] ?: 0f // Возвращает количество крупы в контейнере
    }

    override fun getSpace(cereal: Cereal): Float {
        val currentAmount = storage[cereal] ?: 0f // Текущее количество крупы в контейнере
        return containerCapacity - currentAmount // Возвращает оставшееся место в контейнере
    }

    override fun toString(): String {
        // Возвращает строковое представление содержимого хранилища с использованием локальных названий круп
        return storage.map { (cereal, amount) -> "${cereal.local}: $amount" }.joinToString(", ")
    }
}

