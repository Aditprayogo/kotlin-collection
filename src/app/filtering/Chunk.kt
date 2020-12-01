package app.filtering

fun main() {

    val listInt = (1..100).toList()
    val chunkList = listInt.filter { it % 2 == 0 }
            .chunked(2) {
                var total = 0
                for (number in it) {
                    total += number
                }
                return@chunked total
            }
            .also { println(it) }

}