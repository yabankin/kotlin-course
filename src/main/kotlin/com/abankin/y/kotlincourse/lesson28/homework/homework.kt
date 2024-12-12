package com.abankin.y.kotlincourse.lesson28.homework

import java.io.File

fun main() {

    //Создайте текстовый файл workspace/task1/example.txt
    //запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.
    val file = File("workspace/task1/example.txt")
    file.parentFile.mkdirs()
    file.createNewFile()
    file.writeText("Hello, Kotlin!")
    if (file.exists()) {
        println(
            "Файл существует"
        )
    } else {
        println("Файл не существует")
    }

    //Создайте директорию workspace/task2/testDir
    //проверьте, является ли она директорией, и выведите её абсолютный путь.
    val directory = File("workspace/task2/testDir")
    directory.mkdirs()
    if (directory.isDirectory()) {
        println(directory.absolutePath)
    } else {
        println("Это не директория")
    }

    //Создайте директорию workspace/task3/structure.
    //Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
    //Проверьте, что myDir действительно содержит эти поддиректории
    val directory2 = File("workspace/task3/structure")
    directory2.mkdirs()
    val myDir = File(directory2, "myDir")
    myDir.mkdir()
    val subDir1 = File(myDir, "subDir1")
    val subDir2 = File(myDir, "subDir2")
    subDir1.mkdir()
    subDir2.mkdir()
    if (subDir1.exists() && subDir2.exists()) {
        println("myDir действительно содержит поддиректории $subDir1 и $subDir2")
    }

    //Создайте директорию workspace/task4/temp.
    //Внутри директории temp создайте несколько вложенных файлов и директорий.
    //Удалите директорию workspace/task4 со всем содержимым
    val directory3 = File("workspace/task4/temp")
    directory3.mkdirs()
    (1..3).forEach {
        val subDir = directory3.resolve("subDir$it")
        subDir.mkdirs()
        val file = subDir.resolve("file$it.txt")
        file.createNewFile()
    }
    directory3.parentFile.deleteRecursively()

    //Создайте файл workspace/task5/config/config.txt
    //запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.
    val file2 = File("workspace/task5/config/config.txt")
    file2.parentFile.mkdirs() // Создание родительских директорий
    file2.createNewFile()     // Создание файла (если он не существует)
    val parameters = mapOf(1 to 2, 3 to 4, 5 to 6)
    file2.writeText(parameters.entries.joinToString("\n") { "${it.key}=${it.value}" })
    file2.readLines().forEach { line ->
        val value = line.substringAfter("=")
        println(value)
    }

    //Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов
    val directory4 = File("workspace")
    val directories = directory4.walk().filter { it.isDirectory }.map { it.absolutePath }
    val files = directory4.walk().filter { it.isFile }.map { it.absoluteFile }
    println("Директории:")
    directories.forEach { println(it) }
    println("Файлы:")
    files.forEach { println(it) }

    //Создайте директорию workspace/task9/docs.
    //Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его и запишите текст "This is a README file."
    val directory5 = File("workspace/task9/docs")
    directory5.mkdirs()
    val readme = File(directory5,"readme.md")
    if (!readme.exists()){
        readme.createNewFile()
        readme.writeText("This is a README file.")
    }
    else {
        println("Файл уже существует")
    }

    //Создайте файлы
    //workspace/task10/data/1/4/prod/data14.mysql
    //workspace/task10/data/2/3/prod/data23.mysql
    //workspace/task10/data/5/2/prod/data52.mysql
    //Создайте директорию workspace/task10/backup и скопируйте туда файлы из workspace/task10/data сохраняя структуру директорий.
    //Для копирования используй метод copyTo
    createFileWithDirs("workspace/task10/data/1/4/prod/data14.mysql")
    createFileWithDirs("workspace/task10/data/2/3/prod/data23.mysql")
    createFileWithDirs("workspace/task10/data/5/2/prod/data52.mysql")
    val backup = File("workspace/task10/backup")
    backup.mkdirs()
    val data = File("workspace/task10/data")
    data.copyRecursively(backup)


}

fun createFileWithDirs(path: String) {
    val file = File(path)
    file.parentFile.mkdirs()
    file.createNewFile()
}
