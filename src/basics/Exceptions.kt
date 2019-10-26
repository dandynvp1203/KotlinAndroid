package basics

import java.io.IOException

fun main(arg: Array<String>) {
    //val input = getExternalInput()
    //println(input)


    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        "Exception caught"
    } finally {
        println("Finished trying to read external input")
    }
    println(input)
}

fun getExternalInput(): String {
    throw IOException("Could not read external input")
}