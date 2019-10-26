package oop

interface Drivable {
    fun drive() = println("Driving in Interface") //Not great with default implementation here
}

class Bicycle: Drivable {
    override fun drive() {
        println("Driving bicycle")
    }
}

class Boat: Drivable {
    override fun drive() {
        println("driving boat")
    }
}

fun main() {
    val drivable: Drivable = Bicycle()
    drivable.drive()

}