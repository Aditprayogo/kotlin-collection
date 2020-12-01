package app.Transformation

fun <T> displayMutableIterable(iterable : MutableIterable<T>) {

    val iterator = iterable.iterator()
    while (iterator.hasNext()) {

        val value = iterator.next()
        iterator.remove()
        println(value)
    }
}

fun main() {

    displayMutableIterable(
            mutableListOf("Adit", "ihzar", 2)
    )

}