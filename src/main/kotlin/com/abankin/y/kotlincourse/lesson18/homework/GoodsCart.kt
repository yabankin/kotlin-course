package com.abankin.y.kotlincourse.lesson18.homework

class GoodsCart {
    private val items: MutableMap<Int, Int> = mutableMapOf()

    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        if (amount > 0) {
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }

    fun addToCart(newItems: Map<Int, Int>) {
        for ((itemId, amount) in newItems) {
            if (amount > 0) {
                items[itemId] = items.getOrDefault(itemId, 0) + amount
            }
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    override fun toString(): String {
        var cart = "Корзина товаров:\n"
        var itemsAll = 0
        var quantityAll = 0

        for ((itemId, quantity) in items) {
            cart += ("Товар ID: $itemId, Количество: $quantity\n")
            itemsAll++
            quantityAll += quantity
        }

        cart += "Итого товаров: $itemsAll\n"
        cart += "Общее количество: $quantityAll\n"
        return cart.toString()
    }
}