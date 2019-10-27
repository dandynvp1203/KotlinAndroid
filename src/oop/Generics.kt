package oop

import java.util.*

val list: List<Int> = listOf(1,2,3)

//E for elements, T for types
class TimeSeries<E> {

    private val date2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Data[Date()] = element
        //date2Data.put(Date(), element)
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}

fun <E> timelineOf(vararg elements: E): TimeSeries<E> {
    val result = TimeSeries<E>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main() {
    val timeSeries: TimeSeries<Int> = TimeSeries()
    timeSeries.add(2)
    println(timeSeries.getLatest())

    //vararg allows multiple elements here
    val timeline2 = timelineOf(1, 4, 5, 6)
    val timeSeries3: TimeSeries<String> = timelineOf("", "", "")
}

