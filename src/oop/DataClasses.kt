package oop

//generates hashCode(), equals(), toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode: String, val city: String)

fun main() {
    val residence = Address("MainStreet", 42, "1234", "New York")
    val residence2 = Address("MainStreet", 42, "1234", "New York")

    println(residence)

    // Referential equality
    println(residence === residence2)

    // Structural equality, equals()
    println(residence == residence2)

    // copy()
    val neighbor = residence.copy(number = 41)
    println(neighbor)

    // Destructuring operator
    residence.component1()
    val (street, number, _, city) = residence
    println("$street $number, $city")
}