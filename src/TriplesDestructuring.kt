fun main() {
    val firstUser : Triple<String, Int, Boolean> = Triple("User 1", 20, true)

    val (username, age, agree) = firstUser

    println(username)
    println(age)
    println(agree)
}