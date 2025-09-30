fun main() {
    val ages : Array<Int> = arrayOf(25, 20, 24, 23, 22)

    println("Sum : ${ages.sum()}")
    println("Average : ${ages.average()}")
    println("MaxOrNull : ${ages.maxOrNull()}")
    println("MinOrNull : ${ages.minOrNull()}")
    println("Count : ${ages.count()}")
}