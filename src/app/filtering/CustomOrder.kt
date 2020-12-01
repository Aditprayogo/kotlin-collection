package app.filtering

fun main() {

    val listNumber = listOf("One", "Two", "Three", "Four", "Five")
    val sortedNumber = listNumber.sortedBy { it.length }.also { println(it) }

}