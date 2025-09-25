fun printUser1(vararg users: String) {
    for (user in users) {
        println(user)
    }
}

fun main() {
    printUser1("User 1", "User 2")
}