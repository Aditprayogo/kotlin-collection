package app.Transformation

fun main() {

    val list = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")

    val map = list.associate { value -> Pair(value, value.length) }
    val map1 = list.associateBy { it.length }
    val map2 = list.associateWith { it.length }

    println(map)
    println(map1)
    println(map2)

}