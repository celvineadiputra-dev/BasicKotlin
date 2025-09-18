fun main() {
    // Langkah 1: Inisialisasi total belanja.
    // Kita gunakan tipe Double untuk menangani nilai desimal, seperti biaya layanan nanti.
    var totalBelanja = 0.0
    println("Status Awal -> Total Belanja: Rp$totalBelanja")

    // Langkah 2: Menambahkan 3 item dengan harga 25000.
    // (3 * 25000) dihitung terlebih dahulu, lalu hasilnya ditambahkan ke totalBelanja.
    // Ini adalah contoh penggunaan operator perkalian (*) dan augmented assignment (+=).
    totalBelanja += 3 * 25000
    println("Setelah Item A -> Total Belanja: Rp$totalBelanja")

    // Langkah 3: Menambahkan 2 item lain dengan harga 15000.
    totalBelanja += 2 * 15000
    println("Setelah Item B -> Total Belanja: Rp$totalBelanja")

    // Langkah 4: Memberikan diskon sebesar 10000.
    // Kita menggunakan augmented assignment (-=) untuk mengurangi nilai.
    totalBelanja -= 10000
    println("Setelah Diskon -> Total Belanja: Rp$totalBelanja")

    // Langkah 5: Menghitung dan menambahkan biaya layanan.
    // Biaya layanan adalah 1% dari total saat ini, atau total dibagi 100.
    // Operator pembagian (/) digunakan di sini.
    val biayaLayanan = totalBelanja / 100
    totalBelanja += biayaLayanan
    println("Ditambah Biaya Layanan (Rp$biayaLayanan) -> Total Belanja: Rp$totalBelanja")

    // Langkah 6: Mencetak total akhir yang harus dibayar.
    // Kita bisa menggunakan format string untuk tampilan yang lebih rapi.
    println("\n========================================")
    println("Total Akhir yang Harus Dibayar: Rp${totalBelanja}")
    println("========================================")
}