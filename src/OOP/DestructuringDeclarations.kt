package OOP

data class Kendaraan(val merek : String, val tahun : Int)

fun main() {
    val tayo = Kendaraan("tayo", 2015)
    val (merek, tahun) = tayo

    println(merek)
    println(tahun)
}