package OOP

data class Product(val name: String, val price: Double) {
    val isAvailable: Boolean = true

    fun getFormattedPrice(): String {
        return "Rp $price"
    }
}

fun main() {
    val product1 = Product("Laptop 1", 5000.0)
    val product2 = Product("Laptop 2", 4000.0)

    println(product1)
    println(product2.isAvailable)
    println(product1.getFormattedPrice())
}
