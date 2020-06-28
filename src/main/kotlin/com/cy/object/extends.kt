package com.cy.`object`

/**
 * 在Kotlin中所有类在默认情况下都是无法被继承的
 * 换句话说，在Kotlin中所有类默认情况下都是final的
 * open的含义与final相反
 */
open class Parent(name: String, age: Int) {

}

class Child(name: String, age: Int) : Parent(name, age) {

}

open class Parent2(name: String) {

}

/**
 * 在Kotlin中，如果一个类没有primary方法，那么这个类的每个secondary构造方法就要通过super关键字来初始化父类
 * 或者通过其他secondary构造方法来完成这个任务
 */
class Child2 : Parent2 {

    constructor(name: String) : super(name) {

    }
}