package NextOOP

interface VehicleProperties {
    val weight: Int
    val name: String
        get() = "Vehicle"
}

class Car : VehicleProperties {
    override val weight: Int = 1000
//    override val name: String = "Car"
}

fun main() {
    val car1 = Car()
    println(car1.weight)
    println(car1.name)
}