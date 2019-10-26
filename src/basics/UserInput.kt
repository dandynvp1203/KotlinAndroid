package basics

val PI = 3.1415

fun main(args: Array<String>) {
    val list = listOf("Kotlin", "Android")
    println(list)
    println(PI)

    val anonymous = "Anonymous"

    print("Enter your name: ")
    val input = readLine()

    val name = if (input != null && input.isNotBlank()) {
        input
    } else {
        anonymous
    }

    val message = if (name == anonymous) {
        "Worried about your privacy?"
    } else {
        "Welcome $name, your name is now forever in our database"
    }

    print(message)
}