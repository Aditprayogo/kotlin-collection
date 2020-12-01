package app.Transformation

fun <T> displayIterable(iterable : Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}
/**
 * Itterable -> sebuah iterface di atasnya collection
 * general operation untuk melakukan iterasi seluruh data di collection
 */
fun main() {

    displayIterable(
            listOf("Adit", "ihzar", 2)
    )

    displayIterable(
            setOf("Aditiya", "Ihzar", "eka", "prayogo")
    )

    displayIterable(
            mapOf(
                    Pair("ADitiya", "prayogo")
            ).entries
    )

}
