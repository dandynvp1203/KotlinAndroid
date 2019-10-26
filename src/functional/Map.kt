package functional

fun main() {
    //Map: applies function to each element
    val list = (1..50).toList()

    val doubled = list.map {it * 2}

    val average = list.average()
    val shifted = list.map{ it - average}

    println(doubled)
    println(shifted)
    println()
    //FlatMap: applies and flattens any nested collections

    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    println( nestedList.map {it.sortedDescending()})

    println( nestedList.flatMap { it.sortedDescending() })

    val flattened = nestedList.flatten()
    print(flattened.sortedDescending())
}