package app.filtering

fun main() {

    val list1 = (1..10).toSet()
    val list2 = (6..17).toSet()
    val setOfName = setOf("Aditiya", "Ihzar", "Eka", "Prayogo")

    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]
    println(list1 union list2)

    //[6, 7, 8, 9, 10]
    println(list1 intersect list2)

    //[1, 2, 3, 4, 5]
    println(list1 subtract list2)

    println(setOfName union setOf("Patrick", "Wals"))

    println(setOfName intersect setOf("Ihzar", "Prayogo"))

    println(setOfName subtract  setOf("Ihzar", "Prayogo"))

}