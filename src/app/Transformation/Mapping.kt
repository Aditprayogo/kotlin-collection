package app.Transformation

fun main() {

    val list : List<String> = listOf("aditiya", "ihzar", "eka", "prayogo")
    val list2 = list.map { it.toUpperCase() }
    println(list2)

    val set = setOf("Aditiya", "Prayogo", "SHOLEH")
    val set2 = set.map { it.toLowerCase() }
    println(set2)

    val angka = (1..40)
    val angkaGanjil = angka.mapNotNull {
        if(it % 2 == 0) null
        else it
    }
    println(angkaGanjil)

    val angkaDIkaliIndex = angka.mapIndexed { index, value -> index * value }
    println(angkaDIkaliIndex)



}