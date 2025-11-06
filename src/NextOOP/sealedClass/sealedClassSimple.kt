package NextOOP.sealedClass

// Semua subclass harus didefinisikan di file yang sama
sealed class HasilOperasi {
    data class Sukses(val data: String) : HasilOperasi()
    data class Gagal(val error: String) : HasilOperasi()
    object Loading : HasilOperasi()
}

fun prosesHasil(hasil: HasilOperasi) {
    // 'when' di sini tidak butuh 'else', karena Kotlin tahu
    // kita sudah menangani 'Sukses', 'Gagal', dan 'Loading'.
    when (hasil) {
        is HasilOperasi.Sukses -> println("Berhasil: ${hasil.data}")
        is HasilOperasi.Gagal -> println("Error: ${hasil.error}")
        HasilOperasi.Loading -> println("Sedang memuat...")
    }
}

fun main() {
    prosesHasil(HasilOperasi.Loading)
    prosesHasil(HasilOperasi.Sukses("Success"))
    prosesHasil(HasilOperasi.Gagal("Failed"))
}
