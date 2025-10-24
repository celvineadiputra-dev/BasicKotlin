package OOP

// Sebuah class library
class UserProfile2(val username : String) {

}

fun UserProfile2.userNameToUppercase() : String {
    return this.username.uppercase()
}

fun main() {
    val user1 = UserProfile2("Tom")
    println(user1.username)
    println(user1.userNameToUppercase())
}