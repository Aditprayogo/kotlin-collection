package app.Transformation

fun main() {

    val listString : List<String> = listOf("aditiya", "ihzar", "eka")

    println(listString[0])
    println(listString[1])
    println(listString[2])
    println(listString.contains("aditiya"))
    println(listString.get(2))
    println(listString.lastIndexOf(2.toString()))
    println(listString.isEmpty())
    println(listString.isNotEmpty())

}