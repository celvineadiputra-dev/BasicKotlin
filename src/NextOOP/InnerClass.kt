package NextOOP

class Gedung2(val nama : String) {
    private val alamat : String = "Jln. Sudirman"

    inner class Resepsionis {
        fun sambutTamu(tamu : String) {
            println("Selamat data $tamu di $nama")
            println("Lokasi saat ini $alamat")
        }
    }
}

fun main() {
    val gedungA = Gedung2("UMDP")
    val resepsionisGedungA = gedungA.Resepsionis()

    resepsionisGedungA.sambutTamu("Mahasiswa")
}