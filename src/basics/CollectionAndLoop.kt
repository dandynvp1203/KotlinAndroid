package basics

import java.util.*

fun main (arg : Array<String>) {
    val intList : MutableList<Int> = mutableListOf()

    for (i in 1..20) {
        intList.add(Random().nextInt(100) + 1)
    }

    for (j in intList) {
        print("$j\t")
    }
}