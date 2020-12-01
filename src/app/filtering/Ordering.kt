package app.filtering

data class Fruit(val name: String, val quantity: Int)

data class Task(val name : String, val category : List<String>)

fun main() {

    val listFruit : List<Fruit> = listOf(
            Fruit(name = "Apel", quantity = 20),
            Fruit(name = "Jeruk", quantity = 12),
            Fruit(name = "Nanas", quantity = 32)
    )

    val tasks = listOf<Task>(
            Task(name = "Mencuci", category = listOf("mencuci pakaian", "Mencuci piring")),
            Task(name = "Membersihkan", category = listOf("Tempat tidur", "Gudang"))
    )

    val taskCategory = tasks.flatMap { it.category }.sortedBy { it.length }.also { println(it) }

    println(listFruit.sortedBy { it.quantity })
    println(listFruit.sortedBy { it.name.length })
    println(listFruit.sortedWith(compareBy { it.quantity } ))
    println(listFruit.sortedWith(compareByDescending { it.quantity } ))
    println(listFruit.sortedByDescending { it.quantity })

}