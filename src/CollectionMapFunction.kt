fun main() {
    val fruits : Map<String, Int> = mapOf(
        "apple" to 1,
        "banana" to 7,
        "orange" to 5
    )

    println("Size : ${fruits.size}")
    println("Is Empty : ${fruits.isEmpty()}")
    println("Contains Key : ${fruits.containsKey("banana")}")
    println("Contains Value : ${fruits.containsValue(2)}")
    println("Get : ${fruits.get("apple")}")
    println("Get Or Default : ${fruits.getOrDefault("apple", 0)}")
    println(fruits.keys)
    println(fruits.values)
    println(fruits.entries)
    fruits.entries.forEach { (key, value) ->
        println("$key : $value")
    }
}
