package com.example.questbasickotlin_0060

//List adalah kumpulan data yang disusun secara berurutan dengan metode ascending
//List bersifat ordered, artinya data yang dimasukkan sesuai dengan urutam
//List bersifat mutable dan read-only, artinya dapat diubah dan tidak dapat diubah
//List read-only menggunakan listOf()
//List mutable menggunakan mutableListOf()

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

    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu hanya menyimpan data unique(Tidak boleh ada duplikasi)
//Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//set bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//set mutable menggunakan mutableSetOf()
//set read-only menggunakan setOf()

fun ContohSet(){
    println()
    println("=== Map ===")
    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)
}