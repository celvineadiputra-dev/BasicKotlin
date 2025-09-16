fun main() {
    val firstUser : Pair<String, Int> = Pair("User 1", 20)
    println(firstUser.first)
    println(firstUser.second)

    val secondUser = "User 2" to 20
    println(secondUser.first)
    println(secondUser.second)
}