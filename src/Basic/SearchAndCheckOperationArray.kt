package Basic

fun main() {
    val ages: Array<Int> = arrayOf(25, 20, 24, 23, 22)

    println("Contains : ${ages.contains(30)}")
    println("IndexOf : ${ages.indexOf(20)}")
    println("Any : ${ages.any { it > 24 }}")
    println("All : ${ages.all { it > 20 }}")
}