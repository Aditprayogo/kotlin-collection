package app.Transformation

fun main() {

    val list1 = listOf("Aditiya", "Ihzar", "Eka", "Prayogo")
    val list2 = listOf("Programmer", "Android", "Developer", "Acip")

    val list3 = list1.zip(list2)
    println(list3)

    val list4 : List<String> = list1.zip(list2){ a, b ->
        " $a to $b "
    }
    println(list4)

}