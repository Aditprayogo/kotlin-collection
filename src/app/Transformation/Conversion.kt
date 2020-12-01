package app.Transformation

fun main() {
    val arr = arrayOf(1,3,4,5,6,7,8,9)
    val range = 1..10

    val list = arr.toList()
    val set = arr.toSet()
    println(list)
    println(set)
}