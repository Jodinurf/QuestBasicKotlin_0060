package com.example.questbasickotlin_0060

//conditional expression
//conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
//conditional expression menggunakan if-else

fun ConditionalStatement(){
    println("=== Conditional Expression ===")

    //If-else
    val number = 10
    if(number > 0){
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    //when
    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("invalid Day")
    }

    //Try-Catch
    val value = 10
    try{
        val result = value.toInt()
        println("Result: $Result")
    }catch (e: NumberFormatException){
        println("invalid Number")
    }
}

fun Perulangan(){
    println()
    println("=== Perulangan ===")

    for (i in 1..5){
        println("perulangan ke - $i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars){
        println()
    }

    //while
    var x = 1
    while(x<=5){
        println("Perulangan ke - $x")
        x++
    }

    var y = 1
    do{
        println("Perulangan ke - $y")
        y++
    }while (y <= 5)
}

fun main(){
    ConditionalStatement()
    Perulangan()
}