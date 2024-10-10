package com.example.questbasickotlin_0060

// Lambda functions
// Lambda Functions adalah fungsi yang tidak memiliki nama
// Lambda Function biasanya digunakan untuk membuat fungsi yang sederhana
// lambda function menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//dapat ditulis dengan ekspressi lambda sbb :
fun main(){
    uppercaseString("hello")
    println({string: String -> string.uppercase()}("hello"))
    //hello
}