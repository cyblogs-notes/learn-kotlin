package com.cy.base

import java.util.function.Consumer

/**
 * 除了Idea以外，可以使用Standalone Compiler来编译Kotlin文件
 * ----------------------------
 * 编译Kotlin文件的命令是kotlinc xx.kt
 * 运行Kotlin文件的命令是kotlin xxKt
 * ----------------------------
 * Kotlin可以没有class定义，不过他的默认的class是文件名首字母大写加上Kt，因为如果JVM要执行的话，必须要有类名的
 * 如果要生成一个jar包，或者说，要具有kotlin运行时环境，kotlinc .\app.kt -include-runtime -d app.jar
 *
 */
fun main() {

    println("Hello World")

    val list: List<String> = listOf("hello", "world", "hello world")

    for (item in list) {
        println(item)
    }

    println("----------------------------")

    list.forEach(Consumer { println(it) })

    println("----------------------------")

    list.forEach(System.out::println)

}