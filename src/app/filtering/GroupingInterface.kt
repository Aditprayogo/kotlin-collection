package app.filtering

fun main() {

    val list1 = listOf("a", "a", "a", "b", "b", "b", "c", "c")
    val groupingList = list1.groupingBy { it }

    //menghitung jumlah group nya
    println(groupingList.eachCount())
    println(groupingList.fold("") { first, second ->  first + second})

    val aggregate = groupingList.aggregate { key, first : String?, element, isFirst ->
        if (isFirst) element
        else first + element
    }

}