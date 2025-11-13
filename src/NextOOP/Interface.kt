package NextOOP

interface Vehicle {
    fun accelerate()
    fun stop()
}

class Unicycle: Vehicle {
    var peddling = false

    override fun accelerate() {
        peddling = true
        println("Lebih cepat")
    }

    override fun stop() {
        peddling = false
        println("Stop")
    }
}

fun main() {
    val unicycle1 = Unicycle()

    unicycle1.accelerate()
    unicycle1.stop()
}