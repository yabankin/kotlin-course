package com.abankin.y.kotlincourse.lesson15.homework

class Rack(
    private val shelves: MutableList<Shelf>,
    private val maxShelves: Int
)
{

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves || shelves.contains(shelf)) {
            return false // Полка уже существует уже не влезут на стеллаж (макс количество)
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): Boolean {
        return if (index in shelves.indices) {
            shelves.removeAt(index)
            true
        } else {
            false
        }
    }

    fun addItem(item: String): Boolean {
        val sortedShelves = shelves.sortedBy { it.capacity - it.items.sumOf { i -> i.length } } // Сортируем полки по оставшемуся свободному месту
        for (shelf in sortedShelves) {
            if (shelf.addItem(item)) {
                return true // Предмет успешно добавлен
            }
        }
        return false // На полках недостаточно места
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true // Предмет успешно удален
            }
        }
        return false
    }

    fun isItemInRack(item: String): Boolean {
        return shelves.any { it.isInStock(item) }
    }

    fun getShelves(): List<String> {
        return shelves.map { shelf ->
            "(capacity=${shelf.capacity}, load=${shelf.items.sumOf { it.length }}, items=${shelf.items})"
        }

    }

    fun printContents() {
        for ((index, shelf) in shelves.withIndex()) {
            val remainingCapacity = shelf.capacity - shelf.items.sumOf { it.length }
            println("Полка $index: вместимость ${shelf.capacity}, оставшаяся вместимость $remainingCapacity, предметы: ${shelf.items}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        val remainingItems = mutableListOf<String>() // Список предметов, которые не удалось перераспределить

        // Проверяем, существует ли полка
        if (index !in shelves.indices) {
            return remainingItems // Возвращаем пустой список, если полка не существует
        }

        // Получаем предметы из удаляемой полки
        val itemsToReallocate = shelves[index].itemList()

        // Удаляем полку
        shelves.removeAt(index)

        // Сортируем полки по убыванию свободного места
        val sortedShelves = shelves.sortedByDescending { it.capacity - it.items.sumOf { i -> i.length } }

        // Перераспределяем предметы
        for (item in itemsToReallocate) {
            var itemAdded = false
            for (shelf in sortedShelves) {
                if (shelf.addItem(item)) {
                    itemAdded = true // Предмет успешно добавлен
                    break
                }
            }
            if (!itemAdded) {
                remainingItems.add(item) // Предмет не удалось добавить на другие полки
            }
        }

        return remainingItems // Возвращаем список предметов, которые не удалось перераспределить
    }

}
