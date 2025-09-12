fun main() {
    val pair : Pair<String, String> = Pair("First Name", "Last Name")
    println(pair.first)
    println(pair.second)

    val triple : Triple<String, String, String> = Triple("First Name", "Last Name", "Child Name")
    println(triple.first)
    println(triple.second)
    println(triple.third)

    val coordinates2D : Pair<Float, Float> = Pair(2.3F, 5.5F)
    val (x, y) = coordinates2D

    println("X : $x")
    println("Y : $y")
}