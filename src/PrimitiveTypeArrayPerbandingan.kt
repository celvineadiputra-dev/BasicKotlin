fun prosesDataDenganArrayGenerik() {
    val jumlahData = 1_000_000 // Kita gunakan underscore agar mudah dibaca
    println("--- Memulai Proses dengan Array<Int> (Boxed) ---")

    // 1. Inisialisasi Array
    // Setiap angka (it + 1) akan di-boxing menjadi objek Integer.
    // Kita sedang membuat 1 juta objek di memori.
    val dataSensorBoxed = Array(jumlahData) { it + 1 }

    // 2. Melakukan Kalkulasi
    // Kita akan mengukur waktu yang dibutuhkan untuk menjumlahkan semua elemen
    val waktuMulai = System.nanoTime()

    var total: Long = 0 // Gunakan Long untuk menghindari overflow
    for (data in dataSensorBoxed) {
        total += data
    }

    val rerata = total.toDouble() / jumlahData
    val waktuSelesai = System.nanoTime()
    val durasiMs = (waktuSelesai - waktuMulai) / 1_000_000.0

    // 3. Menampilkan Hasil
    println("Array yang digunakan: Array<Int>")
    println("Jumlah data: $jumlahData")
    println("Total: $total")
    println("Rata-rata: $rerata")
    println("Waktu eksekusi: %.2f ms".format(durasiMs))
    println("--------------------------------------------------\n")
}

fun prosesDataDenganArrayPrimitif() {
    val jumlahData = 1_000_000
    println("--- Memulai Proses dengan IntArray (Primitif) ---")

    // 1. Inisialisasi Array
    // Tidak ada boxing. Nilai int disimpan langsung dalam satu blok memori.
    val dataSensorPrimitif = IntArray(jumlahData) { it + 1 }

    // 2. Melakukan Kalkulasi
    val waktuMulai = System.nanoTime()

    var total: Long = 0
    for (data in dataSensorPrimitif) {
        total += data
    }

    val rerata = total.toDouble() / jumlahData
    val waktuSelesai = System.nanoTime()
    val durasiMs = (waktuSelesai - waktuMulai) / 1_000_000.0

    // 3. Menampilkan Hasil
    println("Array yang digunakan: IntArray")
    println("Jumlah data: $jumlahData")
    println("Total: $total")
    println("Rata-rata: $rerata")
    println("Waktu eksekusi: %.2f ms".format(durasiMs))
    println("--------------------------------------------------\n")
}

fun main() {
    prosesDataDenganArrayGenerik()
    prosesDataDenganArrayPrimitif()
}