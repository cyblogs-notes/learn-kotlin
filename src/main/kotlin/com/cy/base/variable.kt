package com.cy.base

// 可以用as关键字给import过来的方法重新命名，重新命名后，原来的名字就不能使用了
import java.util.Arrays.asList as myAsList

fun main() {
    // 定义一个明确规定类型的常量
    val a: Int = 1
    println(a)

    // 定义一个自动推断类型的常量
    val b = 2
    println(b)

    // 定义一个常量，明确规定类型, 但是不给其赋初值
    val c: Int
    // 变量可以重新赋值
    c = 3
    println(c)

    // 定义一个变量，自动推断类型
    var d = 3
    // 变量可以重新赋值
    d = 4
    println(d)

    /**
     *
     */

    /**
     * /**/
     */

    var x = 10
    val y: Byte = 20
    // Kotlin中小范围的值，是不可以隐式转换为大范围的值的，所以需要显示转换
    x = y.toInt()
    println(x)

    val myAsList = myAsList(1, 2, 3)
    println(myAsList)
}