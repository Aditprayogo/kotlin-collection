package app.filtering

fun main() {

    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10, 11)
    val fitlerGenap = list.filter { it % 2 == 0 }
    println(fitlerGenap)

    val mapString = mapOf(
            "Nama1" to "Aditiya Ihzar",
            "Nama2" to "Eka Prayogo",
            "Nama3" to "Programmer"
    )

    val filterMapString = mapString.filterKeys {
        it.endsWith("1")
    }
    println(filterMapString)

    val namaBurung : List<String> = listOf("Gagak", "Hantu", "Puyuh", "asd")
    val (match, res) = namaBurung.partition { it.length > 3 }
    println(match)
    println(res)

}