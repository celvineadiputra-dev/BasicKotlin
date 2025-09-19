fun main() {
    val users : Array<String> = arrayOf("user 1", "User 2", "User 3")
    val finalExam : Array<Byte> = arrayOf(90, 80, 20)

    val user1 : String = users[0]
    val user2 : String = users.get(1)

    users.set(2, "User 3 Update")
    val user3 : String = users[2]

    println(user1)
    println(user2)
    println(user3)
}