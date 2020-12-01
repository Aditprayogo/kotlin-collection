package app.filtering

fun main() {

    val list : List<String> = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")

    val listInt = listOf("a", "a", "a", "b", "b", "b", "c", "c", "c")

    val groupInt = listInt.groupBy { it }.also { println(it) }

    val listGrouped = list.groupBy { it.first().toUpperCase() }
            .also { println(it) }

    val listGroupedValue = list.groupBy(keySelector = { it.first().toLowerCase() }, valueTransform = {it.toUpperCase()})
            .also { println(it) }



}