package app.filtering

fun main() {

    /**
     * Retrive by position
     */
    val listInt : List<Int> = (1..20).toList()
    val retrive1 = listInt.elementAt(1)
    println(listInt.first())
    println(listInt.last())
    println(listInt.elementAtOrNull(22))
    println(listInt.elementAtOrElse(22) {
        "Data tidak ada"
    })

}