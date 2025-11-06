package NextOOP

// superclass
open class Hewan(val nama : String) {
    open fun suara() {
        println("Hewan bersuara")
    }
}

// subclass
open class Kucing(nama : String) : Hewan(nama) {
    override fun suara() {
        println("Meong")
    }
}

// Subclass kedua mencoba menurunkan dari Kucing
class AnakKucing(nama: String) : Kucing(nama) {
    // ❌ Tidak bisa override karena sudah final di kelas Kucing
    // override fun suara() {
    //     println("$nama mengeong kecil: Miuw~")
    // }
}

fun main() {
    val kucingKu = Kucing("Kucing Ku")
    kucingKu.suara()
}