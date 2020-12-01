package app.Transformation

import java.lang.StringBuilder

data class Human(val name : String, val hobbies : List<String>)

fun main() {

    val human = listOf<Human>(
            Human(name = "Aditiya Ihzar", hobbies = listOf("Football", "Coding")),
            Human(name = "Eka prayogo", hobbies = listOf("Football", "Coding"))
    )

    val humanHobbies = human.map { it.hobbies }.flatten()
    println(humanHobbies)
    val stringJoinHobbies = humanHobbies.joinToString(",")
    println(stringJoinHobbies)

    human.forEach {
        println("Namanya adalah ${it.name}, Hobbinya adalah $stringJoinHobbies")
    }

    val list : List<String> = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")
    val mapping = list.map { it.toUpperCase() }

    val joinToString = mapping.joinToString(",", "", "") { s: String -> "Nama $s"}
    println(joinToString)

    val builder = StringBuilder()
    list.joinTo(builder, ",", "|", "|")
    println(builder)

}