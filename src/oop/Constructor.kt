package oop

class Country(val name: String, val area: Int) {
//    val name: String = name
////    val area: Int = area

    constructor(name: String) : this(name, 0) {
        println("Secondary Constructor called")
    }

    //define what will happen in constructor
    init {

    }

    fun print() = "$name, is $area km^2"
}

fun main() {
    val australia = Country("Australia", 7_700_000)
    println(australia.name + " " + australia.area)

    val spain = Country("Spain")
    println(spain.name + " " + spain.area)
}
