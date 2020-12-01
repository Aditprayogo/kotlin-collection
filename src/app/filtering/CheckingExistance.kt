package app.filtering

fun main() {

    val listName : List<String> = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")
    println(listName.contains("Acip"))
    println(listName.containsAll(listOf("Aditiya", "Ihzar")))
    println("Aditiya" in listName)

}