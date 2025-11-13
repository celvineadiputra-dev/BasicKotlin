package NextOOP

interface Wheeled {
    val numberOfWheels : Int
}

interface Vehicle1 {
    fun drive()
}

class Tricycle() : Wheeled, Vehicle1 {
    override val numberOfWheels: Int = 3
    override fun drive() {
        println("Mengendarai sepeda roda tiga")
    }
}

fun main() {
    val tricycle1 = Tricycle()

    tricycle1.drive()
    println(tricycle1.numberOfWheels)
}