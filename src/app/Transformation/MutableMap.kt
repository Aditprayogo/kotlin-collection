package app.Transformation

fun main() {

    val data : MutableMap<Any, String> = mutableMapOf(
            Pair("data1", "isi data1")
    )

    data.put("Acip", "ahoy")
    data.put("Acipahoy", "Ahoyahoy")
    data.put(12, "iisnya 12")
    data.remove("Acip")

    for ((key, value) in data) {
        println("Keynya aadalah $key dan valuenya adalah $value")
    }


}