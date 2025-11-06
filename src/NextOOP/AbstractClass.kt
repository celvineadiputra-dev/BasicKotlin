package NextOOP

abstract class Printer {
    abstract fun cetak() // Method abstract 'wajib' di-override

    fun info() { // Method non-abstract (konkret)
        println("Ini adalah mesin printer.")
    }
}

class PrinterLaser : Printer() {
    override fun cetak() { // Wajib di-override
        println("Mencetak dengan laser...")
    }
}

fun main() {
    val pLaser = PrinterLaser()
    pLaser.cetak()
    pLaser.info()
}