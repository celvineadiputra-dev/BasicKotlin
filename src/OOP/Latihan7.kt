package OOP

data class GameItem(val id : Int, val name : String, val value : Int, val rarity : String)

class Player(val name : String, var health : Int = 100, var level : Int = 1) {
    fun takeDamage(damage : Int) {
        if(health > 0) {
            health -= damage
        }
    }

    fun levelUp() {
        health = 100
        level += 1
    }

    fun showStatus() {
        println("Nama : $name")
        println("Level : $level")
        println("Health : $health")
    }
}

fun main() {
    // Soal 1:
    val gameItems : List<GameItem> = listOf(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common"),
        GameItem(3, "Jubah Bayangan", 500, "Epic"),
    )

    val cursedSword : GameItem = gameItems[0].copy(name = "Pedang Besi Terkutuk", value = 250)

    println(gameItems[0])
    println(cursedSword)

    // Soal 2:
    val newPlayer = Player("Celvine")
    newPlayer.showStatus()
    println("------------------------------------")
    newPlayer.takeDamage(30)
    newPlayer.showStatus()
    println("------------------------------------")
    newPlayer.levelUp()
    newPlayer.showStatus()
}
