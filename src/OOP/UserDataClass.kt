package OOP

data class User(val name : String, val age : Int)

fun main() {
    val firstUser = User("User 1", 10)
    println(firstUser)

    val secondUser = firstUser.copy()
    val thirdUser = firstUser.copy(age = 20)

    println(secondUser)
    println(thirdUser)
}
