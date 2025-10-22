package OOP

class TranskripNilai {
    val list : List<String> by lazy {
        println("Mengakses nilai transkrip")
        listOf("A", "B", "C")
    }
}

fun main() {
    val transkripNilaiMahasiswa = TranskripNilai()

    println(transkripNilaiMahasiswa.list)
    println(transkripNilaiMahasiswa.list)
}
