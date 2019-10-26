package oop

enum class Direction(degree: Double) {
    NORTH(0.0),
    EAST(90.0),
    SOUTH(180.0),
    WEST(270.0)
}

enum class Suits {
    HEARTS, SPADES, DIAMONDS, CLUBS
}

fun main() {

    val suit = Suits.SPADES

    val color = when(suit) {
        Suits.HEARTS -> "Red"
        Suits.SPADES -> "Blue"
        Suits.CLUBS -> "Yellow"
        Suits.DIAMONDS -> "Green"
    }

    println(color)
}