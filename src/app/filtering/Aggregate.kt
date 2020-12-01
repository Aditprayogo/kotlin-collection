package app.filtering

fun main() {

    val listInt : List<Int> = listOf(1,4,6,8,9,19,12)
    println(listInt.min())
    println(listInt.max())
    println(listInt.average())
    println(listInt.minBy { it % 2 == 0 })
    println(listInt.maxBy { it % 2 == 0 })
    println(listInt.count())

}