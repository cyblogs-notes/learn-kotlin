package com.cy.`object`

// 在Kotlin的类中，只能存在一个primary构造方法，和一个或好多个secondary构造方法
class EmptyClass

// 下面的constructor就是primary构造方法
// 如果没有注解和可见性修饰，constructor关键字就可以省略
class MyClass constructor(username: String) {
    // 初始化代码块，赋初值，可以直接使用构造方法传进来的参数
    init {
        println(username)
    }

    private val username: String = username.toUpperCase()
}

fun main() {
    var myClass = MyClass("张三")
}
