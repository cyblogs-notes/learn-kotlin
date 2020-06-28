package com.cy.base

/**
 * 该案例解释了if ... else ... 可以作为表达式来使用
 */
fun main() {
    maxOrMin01()

    maxOrMin02()

    maxOrMin03()
}

private fun maxOrMin03() {
    val x = 10
    val y = 20

    val max = if (x > y) {
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }
    val min = if (x < y) x else y

    println("max = $max, min = $min")
}

private fun maxOrMin02() {
    val x = 10
    val y = 20

    val max = if (x > y) x else y
    val min = if (x < y) x else y

    println("max = $max, min = $min")
}

private fun maxOrMin01() {
    val x = 10
    val y = 20

    val max: Int
    val min: Int

    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    println("max = $max, min = $min")
}