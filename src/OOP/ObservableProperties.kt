package OOP

import kotlin.properties.Delegates

//class Game {
//    var score : Int = 0
//    var highScore : Int = 0
//
//    fun updateScore(newScore: Int) {
//        this.score = newScore
//
//        if(newScore > highScore) {
//            highScore = newScore
//        }
//    }
//}

class Game {
    var highScore: Int = 0

    var score: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("Properti '${property.name}' berubah dari $oldValue menjadi $newValue")
        if (newValue > oldValue) {
            highScore = newValue
        }
    }

    val x : String by lazy {
        println("EXECUTE")
        "Nilai ABC"
    }
}

fun main() {
    val game = Game()
    game.score = 10
    game.score = 20
    println(game.x)
    println(game.x)
    println(game.score)
    println(game.highScore)
    println(game.x)
}
