fun main() {
    val fruits : Map<String, Int> = mapOf(
        "apple" to 1,
        "banana" to 7,
        "orange" to 5
    )
    println(fruits["apple"])

    val animals : MutableMap<String, Int> = mutableMapOf(
        "dog" to 2,
        "rabbit" to 3,
        "cat" to 3
    )

    println(animals["cat"])
}