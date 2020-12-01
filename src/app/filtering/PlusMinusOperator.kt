package app.filtering

fun main() {

    val list1 = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")
    val list2 = list1 + "Programmer"
    println(list2)

    val list3 = listOf("Acip", "Ahoy")
    println(list1 + list3)

    val list4 = list1 - "Aditiya"
    println(list4)

    val map1 = mapOf("a" to "Aditiya", "b" to "Prayogo")
    println(map1 + mapOf("acip" to "ahoy"))

    val map2 = map1 - "a"
    println(map2)

}