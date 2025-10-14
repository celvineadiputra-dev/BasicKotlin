package Basic

fun main() {
    // =================================================================
    // TUGAS 1: Representasi Data (Inisialisasi Collection)
    // =================================================================
    println("--- 1. Inisialisasi Data ---")

    // Menggunakan List untuk menyimpan judul, boleh ada duplikasi.
    val daftarJudulBuku: List<String> = listOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi" // Duplikasi disengaja sesuai soal
    )
    println("List judul buku berhasil dibuat (mengandung duplikat).")

    // Menggunakan Set untuk genre, otomatis menghilangkan duplikasi.
    val koleksiGenre: Set<String> = setOf(
        "Novel",
        "Filsafat",
        "Sejarah",
        "Novel" // "Novel" yang ini akan diabaikan
    )
    println("Set genre berhasil dibuat (hanya berisi nilai unik).")


    // Menggunakan Map untuk pasangan ISBN (key) -> Judul (value).
    // Dibuat mutable agar bisa ditambahkan data baru nanti.
    val inventarisBuku: MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras"
        // ISBN duplikat tidak bisa dimasukkan ke Map, jadi hanya satu "Laskar Pelangi" yang tersimpan
    )
    println("Map inventaris buku berhasil dibuat (key unik).")
    println("----------------------------------\n")


    // =================================================================
    // TUGAS 2: Manipulasi dan Analisis Data
    // =================================================================
    println("--- 2. Manipulasi dan Analisis Data ---")

    // Mengambil dan mencetak judul buku berdasarkan ISBN
    val judulDicari = inventarisBuku["978-979-3062-79-2"]
    println("Judul buku dengan ISBN 978-979-3062-79-2 adalah: $judulDicari")

    // Menambahkan buku baru ke dalam inventaris
    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"
    println("Buku baru 'Atomic Habits' berhasil ditambahkan.")
    println("Isi inventaris sekarang: $inventarisBuku")


    // Menghitung dan mencetak jumlah genre unik
    println("Jumlah genre unik yang ada di toko: ${koleksiGenre.size}")

    // Mencetak semua judul buku dari List
    println("\nDaftar semua judul buku yang tercatat:")
    daftarJudulBuku.forEach { judul ->
        println("- $judul")
    }
    println("----------------------------------\n")
}