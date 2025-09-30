fun main() {
    val ages: Array<Int> = arrayOf(25, 20, 24, 23, 22)
    println("Ages : ${ages.joinToString()}")

    ages.sort()
    // ages.sorted()
    println("Ages Sort: ${ages.joinToString()}")

    ages.reverse()
    println("Ages Reverse: ${ages.joinToString()}")

    println("Slice : ${ages.slice(2..4).joinToString()}")
}