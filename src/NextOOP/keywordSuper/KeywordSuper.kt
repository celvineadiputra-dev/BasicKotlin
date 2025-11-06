package NextOOP

// Kelas induk
open class Hewan {
    open fun suara() {
        println("Hewan mengeluarkan suara")
    }
}

// Kelas turunan
class Kucing : Hewan() {
    override fun suara() {
        super.suara()  // 🔹 Memanggil method dari kelas induk
        println("Kucing mengeong: Meong~") // Tambahan perilaku
    }
}

fun main() {
    val kucing = Kucing()
    kucing.suara()
}
