fun main() {
    val a : Int = 5
    val b : Int = 10

    var value : String = ""

    if(a > b) {
        value = "OK"
    } else {
        value = "Bad"
    }

    println(value)

    val value2 = if (a > b) {
        "OK"
    } else {
        "Bad"
    }

    println(value2)

    val value3 = if(a > b) "OK" else "Bad"

    println(value3)
}