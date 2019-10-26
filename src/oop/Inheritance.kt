package oop

import kotlin.math.pow

open class Base

class Child : Base()

open class Shape1(val name: String = "Shape") {

    open fun area() = 0.0
}

class Circle1(childName: String, private val radius: Double): Shape1(childName) {

    override fun area() = Math.PI * radius.pow(2.0)
}

fun main() {
    val smallCircle = Circle1("Small Circle", 2.0)
    println(smallCircle.name + smallCircle.area())
}