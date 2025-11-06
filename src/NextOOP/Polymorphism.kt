package NextOOP

// Kelas induk
open class Kendaraan {
    open fun klakson() {
        println("Kendaraan membunyikan klakson: tin tin")
    }
}

// Subclass 1
class Honda : Kendaraan() {
    override fun klakson() {
        println("Honda membunyikan klakson: pom pom")
    }
}

// Subclass 2
class Yamaha : Kendaraan() {
    override fun klakson() {
        println("Yamaha membunyikan klakson: pin pin")
    }
}

// Subclass 3
class Suzuki : Kendaraan() {
    override fun klakson() {
        println("Suzuki membunyikan klakson: ton ton")
    }
}

fun main() {
    // Semua variabel bertipe induk (Kendaraan)
    val daftarKendaraan: List<Kendaraan> = listOf(Honda(), Yamaha(), Suzuki())

    // Polymorphism: satu tipe (Kendaraan) punya banyak bentuk (subclass)
    for (kendaraan in daftarKendaraan) {
        kendaraan.klakson()  // Akan memanggil versi sesuai objek sebenarnya
    }
}
