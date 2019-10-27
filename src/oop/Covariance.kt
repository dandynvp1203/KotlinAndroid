package oop

open class Being
open class Person: Being()
class Student: Person()

fun main() {

    //Covariance = we can use a "more derived" type (a subtype)

    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student()) //covariance

    // Being does not fulfill the contract of class Person
    // people.add(Being())

    val p: Person = Student() // Covariance

    val students: List<Person> = listOf<Student>()
    //val students2: MutableList<Person> = mutableListOf<Student>() -> inconsistency.
}