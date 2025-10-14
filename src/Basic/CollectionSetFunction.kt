package Basic

fun main() {
    val animals: Set<String> = setOf("Zebra", "Apel", "Monyet", "Kucing", "Monyet")

    println("Size : ${animals.size}")
    println("IsEmpty : ${animals.isEmpty()}")
    println("Contains : ${animals.contains("Monyet")}")
    println("ContainsAll : ${animals.containsAll(listOf("Zebra", "Apel"))}")

    val animalIterator = animals.iterator()
    while (animalIterator.hasNext()) {
        println("Animal : ${animalIterator.next()}")
    }
}