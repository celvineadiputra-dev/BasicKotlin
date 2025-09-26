infix fun String.to(type : String) : String {
    return if(type == "UPPERCASE") this.uppercase()
    else this.lowercase()
}

fun main() {
    println("hello wold" to "UPPERCASE")
}