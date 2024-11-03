package com.abankin.y.kotlincourse.lesson17.homework

open class Furniture(
    val name: String,
    val material: String,
    val dimensions: String
)

class OfficeFurniture(
    name: String,
    material: String,
    dimensions: String,
    val drawerCount: Int
) : Furniture(name, material, dimensions)


open class HomeFurniture(
    name: String,
    material: String,
    dimensions: String,
    val style: String
) : Furniture(name, material, dimensions)


class KitchenFurniture(
    name: String,
    material: String,
    dimensions: String,
    style: String,
    val cabinetCount: Int
) : HomeFurniture(name, material, dimensions, style)


class LivingRoomFurniture(
    name: String,
    material: String,
    dimensions: String,
    style: String,
    val hasTvStand: Boolean
) : HomeFurniture(name, material, dimensions, style)


class IndustrialFurniture(
    name: String,
    material: String,
    dimensions: String,
    val maxLoadCapacity: Int
) : Furniture(name, material, dimensions)