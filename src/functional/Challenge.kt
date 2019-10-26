package functional

fun main() {
    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    /*
    * Find the average age of users (use only valid ages for the calculation!)
    * Extract the names of input files that contain faulty data
    * Count the total number of faulty entries across all input files
     */

    //print 4 times for each
    data.forEach { println(it.value.filter { it -> it > 0 }.average()) }

    //flatten
    val averageAge = data.flatMap { it.value }.filter { it >= 0 }.average()
    println(averageAge)


    data.forEach { if (it.value.isEmpty() || it.value.any { it -> it < 0 } ) println(it.key)}

    println(data.flatMap { it.value }.filter { it < 0 }.count())
}