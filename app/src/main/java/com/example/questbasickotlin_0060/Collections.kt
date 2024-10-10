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

    //menghapus data dalam list mutable(remove())
    shape.remove("Triangle")
    println(shape)

    //Mengubah data di dalam list mutable (memanggil index ke - 0 langsung diberi values yang diinginkan)
    shape[0] = "Oval"
    println(shape)
}