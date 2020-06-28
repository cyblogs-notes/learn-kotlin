package com.cy.base

fun main() {
    var a :String = "Hello \n World"
    println(a)

    var b: String = """
        |Hello
        |\n World
        |Welcome
    """.trimMargin()
    println(b)
}