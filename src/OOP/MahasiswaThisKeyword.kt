package OOP

class Mahasiswa(val npm: String, val nama : String, var ipk : Float = 0.0f) {
    fun sayGoodBye(nama : String) {
        println("Good bye, ${this.nama} : $nama")
    }
}

fun main() {
    val mahasiswaPertama = Mahasiswa("202428250001", "Mahasiswa Pertama", 3.5f)

    mahasiswaPertama.sayGoodBye("Nama Lain")
}
