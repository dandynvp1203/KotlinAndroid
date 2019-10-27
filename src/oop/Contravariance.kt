package oop

class Source<out T>(private val t: T) {
    //only return T: producer class
    fun produceT(): T {
        return t
    }
}

class Sink<in T> {
    //cannot return T: consumer class
    fun add(t: T) {}
}

fun main() {
    val strSource: Source<String> = Source("Producer")
    val anySource: Source<Any> = strSource  // Covariance: Any is a subtype of T
    anySource.produceT()

    val anySink: Sink<Any> = Sink()
    val strSink: Sink<String> = anySink // Contra-variance
    strSink.add("Consumer")

    // Invariance = neither covariant or contravariant
}