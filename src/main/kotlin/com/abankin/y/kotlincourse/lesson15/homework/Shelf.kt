package com.abankin.y.kotlincourse.lesson15.homework

class Shelf(
    var capacity: Int,
    var items: MutableList<String>
)  {

    private var load = 0


    fun addItem(item: String): Boolean {
        return if (load + item.length <= capacity) {
            items.add(item)
            load += item.length
            true
        } else {
            false
        }
    }

    fun removeItem(item: String): Boolean {
        return if (items.contains(item)) {
            items.remove(item)
            load -= item.length
            true
        } else {
            false
        }
    }

    fun canAccommodate(item: String): Boolean {
        return if (load + item.length <= capacity) {
            true
        } else {
            false
        }
    }

    fun isInStock(item: String): Boolean {
        return if (items.contains(item)) {
            true
        } else {
            false
        }
    }

    fun itemList(): List<String> {
        return items.toList()
    }


}