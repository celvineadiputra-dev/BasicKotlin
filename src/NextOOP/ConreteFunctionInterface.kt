package NextOOP

interface SpaceVehicle {
    fun accelerate()

    fun stop() {
        println("Slow down")
    }
}

class LightSpace : SpaceVehicle {
    override fun accelerate() {
        println("Speedup")
    }
}

fun main() {
    val lightSpaceOne = LightSpace()
    lightSpaceOne.accelerate()
    lightSpaceOne.stop()
}