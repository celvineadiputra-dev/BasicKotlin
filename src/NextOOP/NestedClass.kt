package NextOOP

class Gedung(val nama: String) {
    private val alamat: String = "Jln. Sudirman"

    class RuangRapat {
        fun mulaiRapat() {
            println("Rapat dimulai....")
            // println("Rapat di gedung $nama")
        }
    }
}

fun main() {
    val rapat = Gedung.RuangRapat()
    rapat.mulaiRapat()
}