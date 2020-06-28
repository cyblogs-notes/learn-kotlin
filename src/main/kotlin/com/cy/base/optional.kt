package com.cy.base

/**
 * 以下例子解释了如何让function返回一个null，以及比较!= null后，Kotlin会自动将Optional类型转换为原类型
 */
fun main() {
    convert2Int("123")

    printMultiply("123", "456")

    printMultiply2("123", "aaa")
}

fun convert2Int(str: String): Int? {
    return try {
        str.toInt()
    } catch (ex: NumberFormatException) {
        null
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param is not a integer")
    }
}

fun printMultiply2(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    // 这里相乘是不被允许的，因为这里相当于是两个Int?类型相乘，所以不合理
//    println(a2Int * b2Int)

    if (null == a2Int) {
        println("param is not a integer")
    } else if (null == b2Int) {
        println("param is not a integer")
    } else {
        // 当上面已经判断不能为null的时候，类型就自动变为了Int（Smart cast to kotlin.Int），所以下面是可以相乘的
        println(a2Int * b2Int)
    }
}