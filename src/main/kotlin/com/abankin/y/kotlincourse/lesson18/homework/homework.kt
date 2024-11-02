package com.abankin.y.kotlincourse.lesson18.homework

fun main(){
    //Animals&Sounds
    val animals = listOf(Dog(), Cat(), Bird())
    for (i in animals.indices) {
        animals[i].makeSound()
        }
    println("---------------------------------------------")
    //Shapes&Area
    val shapes = listOf(Circle(2.5), Square(4.0), Triangle(3.6, 6.7, 35.0))
    for (shape in shapes.indices) {
        println(shapes[shape].area())
    }
    println("---------------------------------------------")
    //Printer
    val text = "fdfsdf 8989 hh vfyghjgj 0 7 jkjk III f"
    val laserPrinter = LaserPrinter()
    laserPrinter.print(text)
    println("---------------------------------------------")
    val inkjetPrinter = InkjetPrinter()
    inkjetPrinter.print(text)
    println("---------------------------------------------")
    //Cart
    val cart = GoodsCart()
    cart.addToCart(1)
    cart.addToCart(2, 3)
    cart.addToCart(mapOf(2 to 3, 4 to 4))
    cart.addToCart(listOf(1, 2, 5))
    println(cart.toString())
    println("---------------------------------------------")
    //Logger
    val logForLogger = Logger()
    logForLogger.log("Информация")
    logForLogger.log("WARNING", "Опасность")
    logForLogger.log("ERROR", "Ошибка")
    val logList = listOf("Сообщение 1","Сообщение 2", "Сообщение 3")
    logForLogger.log(logList)
    val exception = Exception("Все пропало")
    logForLogger.log(exception)

}

fun printColored(text: String, color: String, background: String){
    println("$color$background$text${Color.RESET}")
}