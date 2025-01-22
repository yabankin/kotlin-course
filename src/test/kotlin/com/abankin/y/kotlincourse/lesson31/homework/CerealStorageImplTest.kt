package com.abankin.y.kotlincourse.lesson31.homework

import kotlin.test.Test
import kotlin.test.assertEquals

class CerealStorageImplTest {

    // Создание экземпляра хранилища с заданной ёмкостью контейнеров и хранилища
    private fun createStorage(): CerealStorage {
        return CerealStorageImpl(10.0f, 100.0f)
    }

    @Test
    fun testAddCereal() = with(createStorage()) {
        // Добавление небольшого количества крупы и проверка результата
        addCereal(Cereal.RICE, 2.2f)
        assertEquals(2.2f, getAmount(Cereal.RICE), 0.01f)

        // Добавление крупы до заполнения контейнера
        addCereal(Cereal.RICE, 8.0f)
        assertEquals(10.0f, getAmount(Cereal.RICE), 0.01f)

        // Попытка добавить большее количество, чем контейнер может вместить
        assertEquals(1.0f, addCereal(Cereal.RICE, 1.0f), 0.01f)
    }

    @Test
    fun testGetCereal() = with(createStorage()) {
        // Добавление и получение крупы с проверкой оставшегося количества
        addCereal(Cereal.RICE, 10.0f)
        assertEquals(5.0f, getCereal(Cereal.RICE, 5.0f), 0.01f)
        assertEquals(5.0f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testGetMoreCerealThanAvailable() = with(createStorage()) {
        // Попытка получить больше крупы, чем доступно
        addCereal(Cereal.RICE, 5.0f)
        assertEquals(5.0f, getCereal(Cereal.RICE, 10.0f), 0.01f)
        assertEquals(0.0f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testRemoveContainer() = with(createStorage()) {
        // Проверка удаления пустого контейнера
        removeContainer(Cereal.RICE)
        assertEquals(0f, getAmount(Cereal.RICE), 0.01f)

        // Добавление крупы и проверка, что контейнер не будет удален, пока не пуст
        addCereal(Cereal.RICE, 5.0f)
        removeContainer(Cereal.RICE)
        assertEquals(5f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testGetAmount() = with(createStorage()) {
        // Проверка возврата количества крупы
        addCereal(Cereal.RICE, 10.0f)
        assertEquals(10.0f, getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun testGetSpace() = with(createStorage()) {
        // Проверка оставшегося места в контейнере
        addCereal(Cereal.RICE, 5.0f)
        assertEquals(5.0f, getSpace(Cereal.RICE), 0.01f)
    }

    @Test
    fun testToString() = with(createStorage()) {
        // Проверка строкового представления хранилища
        addCereal(Cereal.RICE, 5.0f)
        assertEquals("RICE: 5.0", toString())
    }
}