package oop

//private - same as in Java - only visible in same file
//protected - same as in Java - only visible in same class and sub classes
//public - same as in Java - visible anywhere (default)
//internal - only visible inside same module(set of kotlin files compile together)

class Car(val brand: String, private val model: String) {
    internal fun tellMeYourModel() = model
}

fun main() {
    val car = Car("BRAND", "MODEL")
    car.brand
    car.tellMeYourModel()
}