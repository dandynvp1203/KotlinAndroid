package functional

import java.io.File

fun main() {

    //scoping
    val reader = File("example.txt").bufferedReader().let {
        if (it.ready()) {
            println(it.readLine())
        }
    }

    //working with nullable
    val str: String? = "Kotlin for Android"
    str?.let {
        if (str.isNotEmpty()) {
            str.toLowerCase()
            println(str)
        }
    }
}