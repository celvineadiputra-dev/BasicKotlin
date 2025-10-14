package Basic

fun main() {
    val users : Array<String> = arrayOf("User 1", "User 2", "User 3")

    users.forEach { user ->
        println("forEach : $user")
    }

    users.forEachIndexed { index, user ->
        println("forEachIndexed $index => $user")
    }
}