package challenge

fun main() {

    val  possiblePrimesAfterTwo = generateSequence(3) {it + 2}

    val primes = generateSequence(2 to possiblePrimesAfterTwo) {

        //Next prime number
        val p = it.second.first()

        //filter out all elements divisible by p
        val possiblePrimeAfterP = it.second.filter { it -> it % p != 0 }

        p to possiblePrimeAfterP
    }.map {it.first}

    println(primes.take(100).toList())
}