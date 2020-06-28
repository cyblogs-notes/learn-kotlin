package com.cy.`object`

// 使用open关键字，表明可以被继承
open class Fruit {

    // 这个属性是可以被继承的
    open val color: String = "white"

    open fun name() {
        println("fruit")
    }

    // 这个方法会被继承下去
    fun expirationDate() {
        println("1 Month")
    }
}

class Apple: Fruit() {

    // 继承了父类的属性
    override val color: String = "red"

    override fun name() {
        println("apple")
    }
}

open class Orange: Fruit() {

    // 继承了父类的属性
    override val color: String = "orange"

    // 这个方法前面加上了final关键字，意味着这个方法无法再继续被继承
    final override fun name() {
        println("range")
    }
}

/*class SmallOrange: Orange() {

    // 这里不能覆写了，编译报错
    override fun name() {
        println("新的继承")
    }
}*/

fun main() {
    val apple = Apple()
    apple.name()
    apple.expirationDate()

    /*val smallOrange = SmallOrange()
    smallOrange.name()*/
}