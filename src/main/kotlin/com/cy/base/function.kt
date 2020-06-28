// Kotlin中的包是一种逻辑概念，并不需要和所在的文件夹完全一致
package com.cy.base

fun main() {
    println(sum(1, 2))
    println(sum2(1, 2))
    myPrint(4, 5)
}

// 方法的定义，返回一个Int
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 方法的定义，自动推断返回类型，不需要大括号
fun sum2(a: Int, b: Int) = a + b

// 没有返回值可以不写返回值
fun myPrint(a: Int, b: Int) {
    // Kotlin中模板字符串的用法
    println("$a + $b = ${a + b}")
}