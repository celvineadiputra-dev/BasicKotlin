package OOP

class Kalkulator {
    companion object {
        fun tambah(a: Int, b: Int): Int {
            return a + b
        }
    }
}

fun main() {
    val hasil = Kalkulator.tambah(3, 5)
    println(hasil)
}