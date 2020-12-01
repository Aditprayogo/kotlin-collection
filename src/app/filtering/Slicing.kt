package app.filtering

fun main() {

    val listInt = (0..100).toList()

    val elementList = listInt.elementAt(1).also { println(it) }

    val list2 = listInt.slice(0..50 step 3)
    println(list2)

    val listString = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")
    println(listString.slice(1..3))

}