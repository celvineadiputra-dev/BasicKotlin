fun main() {
    val hari = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")

    println("=====================================================")
    println("Jumlah hari : ${hari.size}")
    println("Hari pertama : ${hari[0]}")
    println("Hari terakhir : ${hari[hari.size - 1]}")

    hari.set(4, "Jum'at Barokah")
    println(hari[4])
    println("=====================================================")
}