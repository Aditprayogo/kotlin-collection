package app.Transformation

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) println(item)
}

fun main() {
    //    displayMutableCollection(listOf("Aditiya prayogo", "acip")) //error karena list bukan turunan mutableCollection
    displayMutableCollection(mutableListOf("Aditiya prayogo", "acip")) //bisa
    displayMutableCollection(mutableSetOf("Aditiya prayogo", "acip")) //bisa

    displayMutableCollection(mutableMapOf(
            Pair("Aditiy", "Prayogo")
    ).entries) //bisa
}