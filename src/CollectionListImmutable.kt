import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    // Kita definisikan daftar mata kuliah wajib.
    // Karena ini adalah kurikulum inti, datanya tidak seharusnya berubah.
    // Oleh karena itu, kita menggunakan List (immutable).
    val mataKuliahWajib: List<String> = listOf(
        "Kalkulus",
        "Struktur Data & Algoritma",
        "Sistem Basis Data"
    )

    println("Mata Kuliah Wajib Awal: $mataKuliahWajib")
    println("Jumlah SKS Wajib: ${mataKuliahWajib.size}")

    // 1. Contoh Operasi READ-ONLY pada List
    println("\n--- Operasi Read-Only ---")
    println("Mata kuliah pertama adalah: ${mataKuliahWajib[0]}")
    println("Apakah ada 'Kalkulus' di daftar? ${"Kalkulus" in mataKuliahWajib}")

    // 2. Contoh Operasi TRANSFORMASI pada List
    // Ingat, operasi ini TIDAK MENGUBAH list asli. Ia membuat list BARU.
    println("\n--- Operasi Transformasi (Membuat List Baru) ---")

    // Membuat list baru berisi nama mata kuliah dalam huruf kapital
    val namaKapital = mataKuliahWajib.map { it.uppercase(getDefault()) }
    println("Hasil .map (huruf kapital): $namaKapital")

    // Membuat list baru yang hanya berisi mata kuliah dengan nama lebih dari 10 karakter
    val namaPanjang = mataKuliahWajib.filter { it.length > 10 }
    println("Hasil .filter (nama panjang): $namaPanjang")

    // BUKTI: List asli sama sekali tidak berubah setelah operasi map dan filter
    println("\nCEK AKHIR: Mata Kuliah Wajib tetap sama: $mataKuliahWajib")
}
