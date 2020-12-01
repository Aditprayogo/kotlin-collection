package app.filtering

fun main() {

    val listOfInt : List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    val (match, res) = listOfInt.partition { it % 2 == 0 }
    println(match)
    println(res)

    val range = (1..30)
    val (matchRange, resRange) = range.partition { value -> value % 2 == 0 }
    println(matchRange)
    println(resRange)

}