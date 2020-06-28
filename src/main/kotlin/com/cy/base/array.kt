package com.cy.base

fun main() {
    // 普通形式遍历数组
    val arr: IntArray = intArrayOf(1, 2, 3)
    for (item in arr) {
        println(item)
    }

    println("-----------------------")

    // 遍历下标
    for (index in arr.indices) {
        println("arr[$index] = ${arr[index]}")
    }

    println("-----------------------")

    // 遍历下标和值
    for ((index, value) in arr.withIndex()) {
        println("arr[$index] = $value")
    }
}