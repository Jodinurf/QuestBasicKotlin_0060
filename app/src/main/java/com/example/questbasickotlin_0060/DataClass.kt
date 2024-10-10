package com.example.questbasickotlin_0060

import android.provider.ContactsContract.CommonDataKinds.Email

//data class
// data class adalah class yang digunakan untuk menyimpan data.
// data class menyediakan fungsi untuk meng-override (menumpuk) fungsi equals(), hashCode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id:Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    //fungsi Equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2)

    //fungsi copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)
}