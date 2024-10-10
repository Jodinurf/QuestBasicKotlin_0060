package com.example.questbasickotlin_0060

fun withoutParameter(){
    println("=== Without Parameter ===")
    println("Hellow, World")
}

fun withParameter(name:String){
    println()
    println("=== With Parameter ===")
    println("Hello, $name")
}

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("=== With Named Argument ===")
    println("Hello, $name! You are $age years old")
}

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int){
    println()
    println("=== With Default Parameter ===")
    println("Hello, $name you are $age years old")
}

fun withReturn(panjang : Int, lebar : Int) {
    return println(panjang * lebar)
}

fun  main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument("John", age = 30)
    withDefaultParameter(age = 25)
}