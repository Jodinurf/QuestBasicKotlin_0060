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
fun contohSet(){
    println()
    println("=== Set ===")

    //Set read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape : MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam Set mutable (add())
    shape.add("Rectangle")
    println(shape)

}


//Map adalah kumpulan data yang disusun dalam pasangan key-value
//Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//set bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//set mutable menggunakan mutableMapOf()
//set read-only menggunakan mapOf()
fun ContohMap(){
    println()
    println("=== Map ===")
    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //menambahkan data atau element ke dalam mutable map
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data atau element dari mutable map shape
    shape.remove("Circle")
    println(shape)

    //mengubah data atau element di dalam mutable map shape
    shape["Square"] = 5
    println(shape)

    //Map Read-only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}