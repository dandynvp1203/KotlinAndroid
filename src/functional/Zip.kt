package functional

fun main() {
    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    // Pair<String, Boolean>

    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapping = list.zip(list.map {it.contains("t")})

    println(zipped)
    println(mapping)
}