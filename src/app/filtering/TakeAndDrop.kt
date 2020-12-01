package app.filtering

fun main() {

    val list = listOf("Aditiya", "Ihzar", "Eka","Prayogo")
    val slice = list.take(1)
    val lastSlice = list.takeLast(1)
    println(slice)
    println(lastSlice)

    val listInt : List<Int> = (1..10).toList()
    val sliceInt = listInt.drop(9).also { println(it) }
    val sliceLastInt = listInt.dropLast(9).also { println(it) }

    val charList = ('a'..'z').toList()
    val takeWhile = charList.takeWhile { it < 'f' }.also { println(it) }

}