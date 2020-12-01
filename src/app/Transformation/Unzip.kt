package app.Transformation

fun main() {

    val list : List<Pair<String, String>> = listOf(
            "Aditiya" to "Ihzar",
            "Eka" to "Prayogo",
            "Android" to "Developer"
    )

    val list2 = list.unzip()
    println(list2.first)
    println(list2.second)

}