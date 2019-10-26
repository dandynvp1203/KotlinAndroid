package oop

class Robot(private val name: String) {

    fun greetHuman() {
        println("Hello human, my name is $name")
    }

    fun knowsItsName(): Boolean = name.isNotBlank()
}

fun main() {
    val fightRobot = Robot("Gun_dam")
    if (fightRobot.knowsItsName()) fightRobot.greetHuman()
}