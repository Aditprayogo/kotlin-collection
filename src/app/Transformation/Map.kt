package app.Transformation

fun main() {

    val data : Map<String, String> = mapOf(
            "Acip" to "Ahoy",
            "Aditiya" to "prayogo",
            Pair("ADitiya", "Prayogo"),
            Pair("Panjul" ,"Bambang")
    )

    println(data.keys)

    for ((key, value) in data) {
        println("Keynya adalah $key valuenya adalah $value")
    }

}