fun main() {
    val animals : MutableSet<String> = mutableSetOf()
    animals.add("Zebra")
    animals.add("Tikus")
    animals.add("Kucing")
    println(animals)

    animals.remove("Zebra")
    println(animals)

    animals.addAll(listOf("Kucing", "Merpati"))
    println(animals)

    animals.removeAll(listOf("Kucing", "Merpati"))
    println(animals)

    animals.retainAll(listOf("Tikus"))
    println(animals)

    animals.clear()
    println(animals)
}