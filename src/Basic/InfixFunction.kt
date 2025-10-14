package Basic

infix fun String.tox(type : String) : String {
    return if(type == "UPPERCASE") this.uppercase()
    else this.lowercase()
}

fun main() {
    println("hello wold" tox "UPPERCASE")
}