package app.filtering

fun main() {

    val list: List<String> = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")

    //get
    println(list.get(1))
    println(list.getOrNull(4))
    println(list.getOrElse(4, defaultValue = {it}))

    //sublist
    val numbers = (0..13).toList()
    println(numbers.subList(1,3))

    //BInary search
    println(list.binarySearch("Aditiya"))
    println(list.binarySearch("Ihzar"))
    println(list.binarySearch("Eka"))
    println(list.binarySearch("Prayogo"))

    //linear search
    val numbersInteger = listOf(1,1,2,2,3,3,4,4,5,5,6,6)
    println(numbersInteger.indexOf(3))
    println(numbersInteger.lastIndexOf(2))
    println(numbersInteger.lastIndexOf(2))

    println(numbersInteger.indexOfFirst { it > 3 })


}