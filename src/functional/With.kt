package functional

fun main() {

    val props = System.getProperties()

    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }


    //have to call props many times
    props.list(System.out)
    props.propertyNames().toList()
}