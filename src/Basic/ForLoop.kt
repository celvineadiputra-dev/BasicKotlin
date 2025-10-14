package Basic

fun main() {
    val names = arrayOf("User 1", "User 2", "User 3")
    val ages = 17..25

    for(name in names) {
        println(name)
    }

    for (age in ages) {
        println(age)
    }
}