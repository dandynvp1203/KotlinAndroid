package functional

fun main() {

    val list = generateSequence(0) { it + 10}

    val first10 = list.take(10).toList()
    //val without10 = list.drop(10).toList()

    println(first10)
    //println(without10)
}