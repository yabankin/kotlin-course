package com.abankin.y.kotlincourse.lesson27.homework

fun main() {


//--------------------------Функция высшего порядка---------------------------------------------------------------------
    val myFunction: () -> List<Int> = {
        val list = List(1000000) { (0..10000).random() }
        list.sorted()
    }
    val executionTime = timeTracker(myFunction)
    println("Время выполнения: $executionTime мс")


//-----------------Использование apply для инициализации объекта Employee-----------------------------------------------
    val emloyee = Employee("Name", 25, "Position").apply {
        email = "email@mail.com"
        department = "IT"

    }
    println(emloyee.email)
    println(emloyee.department)


//------------------Использование also для логирования------------------------------------------------------------------
    val person = Person("Name", 25).apply {
        email = "email@mail.com"
    }.also {
        personPrint(it)
    }


//------------------Использование with для преобразование Person в Employee---------------------------------------------
    val person2 = Person("Name", 25).apply {
        email = "email@mail.com"
    }

    val employee2 = personToEmployee(person2, "IT").also {
        employeePrint(it)
    }


//------------------Использование run для преобразования и инициализации Employee---------------------------------------
    val person3 = Person("Name", 25).apply {
        email = "email@mail.com"
    }

    val employee3 = person3.run {
        Employee(name, age, "IT").apply {
            email=person3.email
            department = "IT Dept"
        }
    }
    employeePrint(employee3)

//------------------Использование let для безопасного преобразования Person в Employee----------------------------------
    val person4 = Person("Name", 25).apply {
        email = "email@mail.com"
    }

    val employee4 = letPersonBeEmployee(person4)
    employeePrint(employee4)

    val person5 =null
    val employee5 = letPersonBeEmployee(person5)
    employeePrint(employee5)
    println(employee5)

}

fun <T> timeTracker(function: () -> T): Long {
    val startTime = System.currentTimeMillis()
    function()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}

fun personPrint(person: Person) {
    println("-------Person Info-------")
    println("Name:  ${person.name}")
    println("Age:   ${person.age}")
    println("Email: ${person.email}")
    println("-------------------------")
}

fun employeePrint(employee: Employee?) {
    println("-------Employee Info-------")
    println("Name:       ${employee?.name}")
    println("Age:        ${employee?.age}")
    println("Email:      ${employee?.email}")
    println("Position:   ${employee?.position}")
    println("Department: ${employee?.department}")
    println("-------------------------")
}

fun personToEmployee(person: Person, position: String): Employee {
    return with(person) {
        Employee(name, age, position).apply {
            email = person.email
            department = "General"
        }
    }
}

fun letPersonBeEmployee(person: Person?): Employee?{
    return person?.let {
        Employee(person.name, person.age, "IT").apply {
            email = person.email
            department = "IT Dept"
        }
    }
}





