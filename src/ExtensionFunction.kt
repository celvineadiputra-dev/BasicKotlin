fun String.greeting() : String {
    return "Welcome, $this"
}

fun Int.isEven() : Boolean {
    return this % 2 == 0
}

fun main() {
    val username = "Budi"
    println(username.greeting())

    val number1 = 10
    println("Apakah $number1 genap ? ${number1.isEven()}")
}