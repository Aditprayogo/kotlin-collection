 package app.Transformation

fun <T> displayCollection(collection : Collection<T>) {
    for (item in collection) println(item)
}

fun main() {

    displayCollection(listOf("Aditiya", "Prayogo", "Ihzar"))
    displayCollection(setOf("Aditiya", "Prayogo", "Ihzar"))
    displayCollection(mapOf("aditiya" to "prayogo").entries) // error bukan collection
//    displayCollection(mapOf("aditiya" to "prayogo")) // error bukan collection
}