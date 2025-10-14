package Basic

fun main() {
    val mataKuliahWajib: List<String> = listOf(
        "Kalkulus",
        "Struktur Data & Algoritma",
        "Sistem Basis Data"
    )

    // Sekarang, kita definisikan daftar mata kuliah pilihan yang diambil mahasiswa.
    // Daftar ini bisa berubah (menambah/menghapus SKS).
    // Oleh karena itu, kita WAJIB menggunakan MutableList.
    val mataKuliahPilihan: MutableList<String> = mutableListOf("Logika Fuzzy", "Pemrograman Web")

    println("Mata Kuliah Pilihan Awal: $mataKuliahPilihan")

    // 3. Contoh Operasi MODIFIKASI pada MutableList
    // Operasi ini MENGUBAH list-nya secara langsung (in-place).
    println("\n--- Operasi Modifikasi (Mengubah List Asli) ---")

    // Mahasiswa menambah mata kuliah baru
    mataKuliahPilihan.add("Kecerdasan Buatan")
    println("Setelah .add('Kecerdasan Buatan'): $mataKuliahPilihan")

    // Ternyata ada mata kuliah prasyarat yang harus diambil lebih dulu
    // Kita sisipkan di awal (indeks 0)
    mataKuliahPilihan.add(0, "Aljabar Linear")
    println("Setelah .add(0, 'Aljabar Linear'): $mataKuliahPilihan")

    // Mahasiswa memutuskan untuk mengganti salah satu mata kuliah
    mataKuliahPilihan[2] = "Pengembangan Aplikasi Mobile" // Mengganti "Pemrograman Web"
    println("Setelah mengubah indeks ke-2: $mataKuliahPilihan")

    // Mahasiswa membatalkan (drop) mata kuliah pertama
    mataKuliahPilihan.removeAt(0)
    println("Setelah .removeAt(0): $mataKuliahPilihan")

    // BUKTI: List asli benar-benar berubah
    println("\nCEK AKHIR: Mata Kuliah Pilihan telah berubah: $mataKuliahPilihan")

    println("\n\n===== SESI 3: MENGGABUNGKAN KEDUANYA =====")
    // Kita bisa menggabungkan list immutable dan mutable untuk membuat list BARU
    val semuaMataKuliah = mataKuliahWajib + mataKuliahPilihan
    println("Daftar semua mata kuliah yang diambil (List Baru): $semuaMataKuliah")
    println("Total SKS yang diambil: ${semuaMataKuliah.size}")
}