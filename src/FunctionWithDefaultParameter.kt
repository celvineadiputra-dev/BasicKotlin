fun sayHello1(firstName : String, lastName : String = "") {
    println("Hello $firstName $lastName")
}

fun main() {
    sayHello1("Budi", "Bude")
    sayHello1("Ani")
}