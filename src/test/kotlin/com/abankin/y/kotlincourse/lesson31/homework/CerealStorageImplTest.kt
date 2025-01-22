package com.abankin.y.kotlincourse.lesson31.homework

import kotlin.test.Test
import kotlin.test.assertEquals

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(10.0f, 100.0f)

    @Test
    fun testAddCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        assertEquals(2.2f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testAddCereal2() = with(storage) {
        addCereal(Cereal.RICE, 8.0f)
        assertEquals(8.0f, getAmount(Cereal.RICE), 0.01f)
        addCereal(Cereal.RICE, 2.0f)
        assertEquals(10.0f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testAddCereal3() = with(storage) {
        addCereal(Cereal.RICE, 10.0f) // Добавляем ровно до ёмкости
        assertEquals(1.0f, addCereal(Cereal.RICE, 1.0f), 0.01f) // Проверяем сдачу
        assertEquals(10.0f, getAmount(Cereal.RICE), 0.01f) // Проверяем, что контейнер заполнен до максимума
    }

    @Test
    fun testGetCereal() = with(storage) {
        // Добавление и получение крупы с проверкой оставшегося количества
        addCereal(Cereal.RICE, 10.0f)
        assertEquals(5.0f, getCereal(Cereal.RICE, 5.0f), 0.01f)
        assertEquals(5.0f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testGetMoreCerealThanAvailable() = with(storage) {
        // Попытка получить больше крупы, чем доступно
        addCereal(Cereal.RICE, 5.0f)
        assertEquals(5.0f, getCereal(Cereal.RICE, 10.0f), 0.01f)
        assertEquals(0.0f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testRemoveContainer() = with(storage) {
        // Проверка удаления пустого контейнера
        removeContainer(Cereal.RICE)
        assertEquals(0f, getAmount(Cereal.RICE), 0.01f)

        // Добавление крупы и проверка, что контейнер не будет удален, пока не пуст
        addCereal(Cereal.RICE, 5.0f)
        removeContainer(Cereal.RICE)
        assertEquals(5f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testGetAmount() = with(storage) {
        // Проверка возврата количества крупы
        addCereal(Cereal.RICE, 10.0f)
        assertEquals(10.0f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testGetSpace() = with(storage) {
        // Проверка оставшегося места в контейнере
        addCereal(Cereal.RICE, 5.0f)
        assertEquals(5.0f, getSpace(Cereal.RICE), 0.01f)
    }

    @Test
    fun testToString() = with(storage) {
        // Проверка строкового представления хранилища
        addCereal(Cereal.RICE, 5.0f)
        assertEquals("Рис: 5.0", toString())
    }
}