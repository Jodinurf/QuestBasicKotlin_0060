package com.example.questbasickotlin_0060

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "marry@gmail.com")

    println(contact.email)
}