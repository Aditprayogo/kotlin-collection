package app.filtering

fun main() {

    val list = listOf("Aditiya", "Ihzar", "Eka", "prayogo")
    println(list.any { it.length > 5 })
    println(list.none { it.length > 5 })
    println(list.all { it.length > 5 })

}