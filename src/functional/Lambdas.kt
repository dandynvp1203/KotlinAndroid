package functional

fun main(args: Array<String>) {

    val timesTwo = { x: Int -> x*2 }

    val add: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    val list = (1..20).toList()

    //filter() takes int as input and returns boolean -> higher order function
    list.filter { element -> element%2 == 0 }
    println("$list\t")

    println(list.filter { element -> element%2 == 1})

    //use it when fun has only 1 parameter
    println(list.filter { it % 2 == 0 })

    println(list.filter { it.even() })

    //function pointer, must mach the arguments
    println(list.filter(::isEven))
}

fun isEven(i: Int) = i % 2 == 0

//extension function
fun Int.even() = this % 2 == 0