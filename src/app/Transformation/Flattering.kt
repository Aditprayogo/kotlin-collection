package app.Transformation

data class Member(val name: String, val hobies : List<String>)

fun main() {

    val list : List<List<String>> = listOf(
            listOf("Aditiya", "Ihzar", "Eka", "Prayogo"),
            listOf("Aditiya", "Ihzar", "Eka", "Prayogo"),
            listOf("Aditiya", "Ihzar", "Eka", "Prayogo"),
            listOf("Aditiya", "Ihzar", "Eka", "Prayogo")
    )
    val faltern = list.flatten()
    println(faltern)

    val members : List<Member> = listOf(
            Member(name = "Aditiya", hobies = listOf("Reading", "Coding")),
            Member(name = "Aditiya", hobies = listOf("Cooking", "Gardening")),
            Member(name = "Aditiya", hobies = listOf("Gamming", "Football")),
            Member(name = "Aditiya", hobies = listOf("Reading", "Coding"))
    )

    val memberHobbies = members.flatMap { it.hobies }
    val hobbies = members.map { it.hobies }.flatMap { it } //dua kali operasi
    println(memberHobbies)
}