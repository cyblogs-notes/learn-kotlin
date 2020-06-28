package com.cy.`object`

class Student(private val username: String, private val age: Int, private var address: String) {

    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

/**
 * 如果构造方法拥有注解或者可见性修饰符
 * 那么constructor关键字就是不能省略的，并且他位于修饰符后面
 */
class Student2 private constructor(username: String) {

}

/**
 * 在JVM上，如果类的primary构造方法的所有参数都有默认值，那么kotlin编译器就会为这个类生成一个不带参数的构造方法
 * 这个不带参数的构造方法会使用这些参数的默认值，这样的目的在于更好的和Spring等框架集成
 */
class Student3 (val username: String = "张三") {

}

fun main() {
    val student = Student("张三", 11, "Beijing")
    student.printInfo()

    val student3 = Student3()
    println(student3.username)
}