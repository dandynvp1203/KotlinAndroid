package functional

fun main() {

    //Kotlin lazy sequences = Java 8 strings

    val inputRows = listOf(
        mapOf("input01.csv" to listOf(3, 5, -543, 5, 24, 13)),
        mapOf("input02.csv" to listOf(7, 0, -12, 5, 6, 45)),
        mapOf("input03.csv" to listOf()),
        mapOf("input04.csv" to listOf(8, 12, 0, 1, 7, 14))
    )

    //only flatten a map of values, get rid of the file names, then only keep anything between 0-100
    val cleaned = inputRows.flatMap { it.values }
        .flatten()
        .filter { it in 0 .. 100 }
        .toIntArray()

    //keep call functions one after one is called chaining
    println(cleaned.joinToString())
}