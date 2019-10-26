package functional

import kotlin.system.measureTimeMillis

fun main() {

    val veryLongList = (1..999999).toList()

    veryLongList.filter { it > 50 }
        .asSequence() // -> each will be evaluated lazily
        .map { it * 2 }
        .take(60)
        .sum()

    var sum = 0L
    var layzySum = 0L

    val seq = generateSequence(1, {it + 1})

    //println(veryLongList)

    //println(seq.take(10).toList())

    val msNonLazy =  measureTimeMillis {
        sum = veryLongList
            .filter { it > 50 }
            .map { it * 2 }
            .take(60)
            .sum().toLong()
    }

    val msLazy = measureTimeMillis {
        layzySum= veryLongList
            .filter { it > 50 }
            .asSequence() // -> each will be evaluated lazily
            .map { it * 2 }
            .take(60)
            .sum().toLong()
    }

    println("NoneLazy takes: $msNonLazy")
    println("Lazy takes: $msLazy")
}