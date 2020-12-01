package app.filtering

fun main() {
    
    val list : List<Int> = listOf(2,2,2,1)
    val listInt : List<Int> = listOf(1,4,6,8,9,12,4)
    println(list.reduce { value, i -> value + i })

    println(listInt.reduce { value, value2 ->
        if (value < value2) value2
        else value
    })

    val count = listInt.fold(0) { acc, i ->
        acc + 1
    }

    println(count)
    println(listInt.count())

}