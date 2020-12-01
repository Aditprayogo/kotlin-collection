package app.filtering

fun main() {

    val listName = listOf("aditiya", "Ihzar", "Eka", "Prayogo")

    val retriveByCondition = listName
            .first { it.length > 5 }
            .also { println(it) }

    val retrive1 = listName
            .firstOrNull { it.startsWith("i", true) }
            .also { println(it) }

    val retrive2 = listName
            .firstOrNull { it.startsWith("z", true) }
            .also { println(it) }

}