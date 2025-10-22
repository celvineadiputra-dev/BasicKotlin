package OOP

import kotlin.properties.Delegates

class NilaiMahasiswa {
    var nilai: Float by Delegates.vetoable(0.0f) { property, oldValue, newValue ->
        if(newValue > 0.0f && newValue <= 100.0f) {
            println("Berhasil merubah nilai")
            true
        } else {
            println("Nilai harus lebih besar dari 0 dan lebih kecil atau sama dengan 100")
            false
        }
    }
}

fun main() {
    val nilaiMahaiswa = NilaiMahasiswa()

    nilaiMahaiswa.nilai = -1.0f
    println(nilaiMahaiswa.nilai)

    nilaiMahaiswa.nilai = 20.5f
    println(nilaiMahaiswa.nilai)
}