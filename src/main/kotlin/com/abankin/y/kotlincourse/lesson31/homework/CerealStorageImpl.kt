package com.abankin.y.kotlincourse.lesson31.homework

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
        // Проверка на отрицательное количество крупы
        require(amount >= 0) { "Количество не может быть отрицательным" }

        val currentAmount = storage[cereal] ?: 0f // Текущее количество крупы в контейнере
        val totalAmount = currentAmount + amount // Общее количество после добавления

        return if (totalAmount > containerCapacity) {
            val remainingAmount = totalAmount - containerCapacity // Количество, не помещающееся в контейнер
            storage[cereal] = containerCapacity // Заполняем контейнер до максимума
            remainingAmount // Возвращаем оставшееся количество
        } else {
            storage[cereal] = totalAmount // Обновляем количество в контейнере
            0f // Нет оставшегося количества
        }
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
        if ((storage[cereal] ?: 0f) == 0f) {
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
        // Возвращает строковое представление содержимого хранилища
        return storage.map { (cereal, amount) -> "${cereal.name}: $amount" }.joinToString(", ")
    }
}

