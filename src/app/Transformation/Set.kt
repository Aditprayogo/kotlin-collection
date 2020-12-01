package app.Transformation

import data.Person

fun main() {

    val set : Set<Person> = setOf(
            Person("Aditiya"), Person("Prayogo"), Person("Eka")
    )

    println(set.size)
    println(set.contains(Person("Aditiya")))

    for (person in set) {
        println(person)
    }

}