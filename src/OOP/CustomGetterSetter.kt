package OOP

class NilaiUjian(nilaiUts: Double) {
    var nilaiUts: Double = nilaiUts
        get() = field * 0.1
        set(value) {
            field = if (value < 0) 0.0 else value
        }

    val nilaiAkhir: Double
        get() = nilaiUts * 2
}


fun main() {
    val nilaiUtsMahasiswaPertama = NilaiUjian(80.3)

    println(nilaiUtsMahasiswaPertama.nilaiUts)
    println(nilaiUtsMahasiswaPertama.nilaiAkhir)

    nilaiUtsMahasiswaPertama.nilaiUts = -20.0
    println(nilaiUtsMahasiswaPertama.nilaiUts)
}

