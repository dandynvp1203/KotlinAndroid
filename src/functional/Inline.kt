package functional

inline fun modifyString(str: String, operation: (String) -> String): String {
    return str.toUpperCase()
}

fun main(args: Array<String>) {
    modifyString("Kotlin is amazing", { it.toUpperCase() })
}