package app.Transformation

import data.Person

fun main() {

    val mutableSet : MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("aditiya"))
    mutableSet.add(Person("Ihzar"))
    mutableSet.add(Person("eka"))
    mutableSet.add(Person("prayogo"))
    println(mutableSet.contains(Person("aditiya")))

    for (person in mutableSet) {
        println(person)
    }

}