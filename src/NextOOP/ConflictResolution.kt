package NextOOP

interface MoveA {
    fun move() {
        println("Move A")
    }
}

interface MoveB {
    fun move() {
        println("Move B")
    }
}

class Human : MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}

fun main() {
    val human1 = Human()
    human1.move()
}