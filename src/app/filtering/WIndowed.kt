package app.filtering

fun main() {

    val listInt = (1..20).toList()
    val listIntWindowed = listInt.windowed(3).also { println(it) }

}