package NextOOP.sealedClass

// Kelas sealed — hanya bisa diturunkan di file yang sama
sealed class Kendaraan {
    abstract fun info()
}

// Subclass pertama
class Mobil(val merk: String) : Kendaraan() {
    override fun info() {
        println("Ini adalah mobil merk $merk")
    }
}

// Subclass kedua
class Motor(val merk: String) : Kendaraan() {
    override fun info() {
        println("Ini adalah motor merk $merk")
    }
}

// Subclass ketiga (object singleton)
object Sepeda : Kendaraan() {
    override fun info() {
        println("Ini adalah sepeda")
    }
}

// Fungsi yang menggunakan when-expression dengan sealed class
fun cetakInfoKendaraan(k: Kendaraan) {
    when (k) {
        is Mobil -> println("Kendaraan roda 4: ${k.merk}")
        is Motor -> println("Kendaraan roda 2: ${k.merk}")
        is Sepeda -> println("Kendaraan tanpa mesin")
    }
}

fun main() {
    val kendaraan1: Kendaraan = Mobil("Honda")
    val kendaraan2: Kendaraan = Motor("Yamaha")
    val kendaraan3: Kendaraan = Sepeda

    kendaraan1.info()
    kendaraan2.info()
    kendaraan3.info()

    println("\nMenggunakan when-expression:")
    cetakInfoKendaraan(kendaraan1)
    cetakInfoKendaraan(kendaraan2)
    cetakInfoKendaraan(kendaraan3)
}
