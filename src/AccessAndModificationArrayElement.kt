fun main() {
    val users : Array<String> = arrayOf("User 1", "User 2", "User 3")
    println("Elemen kedua : ${users[1]}")

    users[0] = "User 1 Update"
    println("Data setelah diubah : ${users[0]}")
}