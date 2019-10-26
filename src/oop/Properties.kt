package oop

class City {

    var name: String = ""
        get() = field
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
        // -> override setter and getter
    var population: Int = 0
}

fun main() {
    val berlin = City()
    berlin.name = "Berlin"
    berlin.name = " "
    berlin.population = 3_500_000

    println(berlin.name)
    println(berlin.population)
}