package app.Transformation

fun main() {

    val mapInt : Map<Int, String> = mapOf(
            1 to "Aditiya",
            2 to "Ihzar",
            3 to "Eka",
            4 to "Prayogo"
    )
    val mapKeys = mapInt.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = mapInt.mapValues { it.value.toUpperCase() }
    println(mapValues)

}