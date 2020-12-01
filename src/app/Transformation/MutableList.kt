package app.Transformation

fun main() {

    val mutableListString : MutableList<String> = mutableListOf()

    mutableListString.add("Aditiya")
    mutableListString.add("prayogo")
    mutableListString.add("Panjul")
    mutableListString.add("Bambang")
    mutableListString.removeAt(1)

    for (value in mutableListString) {
        println(value)
    }

}