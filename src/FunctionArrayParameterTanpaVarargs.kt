fun printUser(users : Array<String>) {
    for (user in users) {
        println(user)
    }
}

fun main() {
    val users = arrayOf("User 1", "User 2")
    printUser(users)
}