package Basic

fun main() {
    val fruits : MutableMap<String, Int> = mutableMapOf(
        "apple" to 1,
        "banana" to 7,
        "orange" to 5
    )

    fruits["apple"] = 10
    // fruits.put("apple", 10)
    println(fruits.entries)

    fruits.remove("orange")
    println(fruits.entries)

    fruits.putAll(mapOf(
        "apple" to 2
    ))
    println(fruits.entries)

    fruits.clear()
    println(fruits.entries)
}