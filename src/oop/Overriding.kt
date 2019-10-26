package oop

abstract class Vehicle(open val brand: String = "") { //cannot be var here
    open fun drive() = print("Driving in Vehicle")
    abstract fun honk()
}

class Sedan(override val brand: String = "BRAND"): Vehicle(), Drivable {
    override fun honk() {
        println("Honking")
    }

    override fun drive() {
        super<Drivable>.drive()
    }
}

fun main() {
    val sedan = Sedan()
    sedan.drive()
}