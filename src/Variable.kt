const val APP_NAME = "Belajar Kotlin Dasar"
const val APP_VERSION: String = "0.0.1"

fun main() {
    // Contoh penggunaan var
    var playerScore = 100
    println(playerScore)

    playerScore = 103 // merubah isi dari variable var
    println(playerScore)

    // Contoh penggunaan val
    val npm = "2428250030"
    println(npm)

    //    npm = "123" // error
    //    println(npm)

    println(APP_NAME)
    println(APP_VERSION)
}