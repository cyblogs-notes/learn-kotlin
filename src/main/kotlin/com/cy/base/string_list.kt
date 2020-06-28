package com.cy.base

fun main() {
    val array = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")

    for (item in array) {
        println(item)
    }

    println("------------------------")

    if ("world" in array) {
        println("world is in collection!")
    }

    println("------------------------")

    array
        .filter { it.length > 5 }
        .map { it.toUpperCase() }
        .sorted()
        .forEach { println(it) }

}