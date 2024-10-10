package com.example.questbasickotlin_0060

fun nullSafety(){
    // neverNull mempunyai type string
    var neverNull: String = "This can't be null"

    // throws a compiler error
    // neverNull = null

    //nullable mempunyai nullable tipe string
    var nullable: String? = "You can keep a null here"
    //this is OK
    nullable = null;

    //check for null in conditions
    if (neverNull == null){
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    //notNull doesn't accept null values
    fun strLength(notNull: String):Int{
        return notNull.length
    }

    println(strLength(neverNull))//18
}

fun main(){
    nullSafety()
}

