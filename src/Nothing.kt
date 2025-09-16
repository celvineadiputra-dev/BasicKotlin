fun fail(message : String) : Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    fail("hello world")
}