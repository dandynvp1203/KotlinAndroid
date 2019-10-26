package oop

import kotlin.math.pow

abstract class Shape(val name: String) {

    abstract fun area(): Double
}

class Circle(name: String, private val radius: Double): Shape(name) {
    override fun area(): Double = Math.PI * radius.pow(2)
}

fun main() {
    val shape = Circle("Large circle", 16.0)
    println(shape.area())
    println(shape.name)
}