package com.cy.base

/**
 * 以下代码解释了is关键字的使用
 */
fun main() {
    println(convert2Uppercase("Hello World"))
    println(convert2Uppercase(23))
}

fun convert2Uppercase(str: Any): String? {
    // 如果这里的is成立的话，那么Kotlin会自动将str转换为String类型
    if (str is String) {
        return str.toUpperCase()
    }
    return null
}