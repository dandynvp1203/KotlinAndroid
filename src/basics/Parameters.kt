package basics

fun main(arg: Array<String>) {
    /*
    * Kotlin has default parameter values and named arguments
    * That means parameters can be passed in different order
     */
    val together = concat(separator = " : ", texts = listOf("Kotlin", "Java", "Scala"))
    print(together)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)