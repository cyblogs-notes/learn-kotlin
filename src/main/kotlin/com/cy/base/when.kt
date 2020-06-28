package com.cy.base

fun main() {
    println(myPrint("hello"))
    println(myPrint("test"))
    println(myPrint("hello world"))

    println("------------------------------")
    println(myPrint2("test"))

    println("------------------------------")
    // when关键字的多种用法
    val a = 6
    val result = when (a) {
        1 -> {
            println("a = 1")
            10
        }
        2 -> {
            println("a = 2")
            20
        }
        // a是3,4,5中的任意一个
        3, 4, 5 -> {
            println("a = 3 OR 4 OR 5")
            30
        }
        // a是6，7，8，9，10中的任意一个
        in 6..10 -> {
            println("a is between 6 and 10")
            40
        }
        // 其他情况
        else -> {
            println("a is other value")
            50
        }
    }

    println(result)
}

/**
 * when的基本用法
 */
fun myPrint(str: String): String {
    when (str) {
        "hello" -> return "HELLO"
        "test" -> return "TEST"
        "hello world" -> return "HELLO WORLD"
        else -> return "Other Input"
    }
}

/**
 * 可以将when直接作为返回值来使用
 */
fun myPrint2(str: String) = when (str) {
    "hello" -> "HELLO"
    "test" -> "TEST"
    "hello world" -> "HELLO WORLD"
    else -> "Other Input"
}