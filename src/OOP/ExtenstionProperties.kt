package OOP

// Sebuah class library
class UserProfile(val username : String) {

}

val UserProfile.userNameUppercase : String
    get() = this.username.uppercase()

fun main() {
    val user1 = UserProfile("Tom")
    println(user1.username)
    println(user1.userNameUppercase)
}