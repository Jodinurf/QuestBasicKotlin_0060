package com.example.questbasickotlin_0060

fun ContohList() {
    println("=== List ===")
    //List read-only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape : MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam list mutable (add())
    shape.add("Circle")
    println(shape)

    
}