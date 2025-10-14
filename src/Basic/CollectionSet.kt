package Basic

fun main() {
    // Immutable
    val animals: Set<String> = setOf("Zebra", "Monyet", "Kucing", "Monyet")
    println(animals)

    // Mutable
    val fruits : MutableSet<String> = mutableSetOf("Apel", "Duren", "Belimbing")
    println(fruits)
}