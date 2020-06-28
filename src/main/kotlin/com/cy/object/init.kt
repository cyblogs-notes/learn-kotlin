package com.cy.`object`

class Person constructor(username: String) {

    private var username: String

    private var age: Int

    private var address: String

    init {
        println("Init: $username")
        this.username = username
        this.age = 22
        this.address = "BeiJing"
    }

    // Secondary构造方法，必须要直接或间接的调用Primary构造方法
    constructor(username: String, age: Int) : this(username) {
        println("两个参数的Secondary构造方法")
        this.age = age
    }

    constructor(username: String, age: Int, address: String) : this(username, age) {
        println("三个参数的Secondary构造方法")
        this.address = address
    }

    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

fun main() {
    val person = Person("张三")
    val person1 = Person("李四", 39)
    val person2 = Person("王五", 29, "Guangzhou")

    person.printInfo()
    person1.printInfo()
    person2.printInfo()
}