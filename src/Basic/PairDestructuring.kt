package Basic

fun main() {
    val firstUser : Pair<String, Int> = Pair("User 1", 20)

    val (username1, age1) = firstUser

    println(username1)
    println(age1)

    val secondUser = "User 2" to 20

    val (username2, age2) = secondUser

    println(username2)
    println(age2)
}