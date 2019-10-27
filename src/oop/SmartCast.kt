package oop

fun Bicycle.replaceWheel() {
    println("Replacing wheel...")
}

fun Boat.startEngine(): Boolean {
    println("Starting engine...")
    return true
}

fun main() {
    val vehicle: Drivable = Bicycle()

    // instanceOf in Java = is in Kotlin
    if (vehicle is Bicycle) {
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngine()
    }

    if (vehicle is Boat && vehicle.startEngine()) {
        TODO()
    }

    if (vehicle !is Boat || vehicle.startEngine()) {
        TODO()
    }

    if (vehicle !is Bicycle) {
        return
    }

    vehicle.replaceWheel()
}