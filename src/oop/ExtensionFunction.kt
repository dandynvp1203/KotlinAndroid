package oop

fun Int.isEven(): Boolean = (this % 2 == 0)

fun Country.isLarge() = area > 1_000_000

fun main() {
    println(5.isEven())

    val naturals = listOf(2, 11, 5, 8)
    println(naturals.filter { it.isEven() })

    val vietnam = Country("Vietnam", 3_000_000)
    println(vietnam.isLarge())
}