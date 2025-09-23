fun main() {
    println("Nama Pemain : ")
    val namaPemain: String = readln()
    var kesehatanPemain: Byte = 100
    var punyaKunciEmas: Boolean = false
    var jumlahPotion: Int = 2
    var sedangBermain: Boolean = true

    while (sedangBermain) {
        if (kesehatanPemain <= 0) {
            println("Kesehatanmu habis! GAME OVER.")
            sedangBermain = false
        } else {
            println("================================")
            println("Nama : ${namaPemain}")
            println("Kesehatan : ${kesehatanPemain}")
            println("Potion : ${jumlahPotion}")
            println("================================")
            println("Di depanmu ada dua jalur, silahkan pilih (1 atau 2)")
            println("1. Jalur Gelap")
            println("2. Jalur Berangin")
            val jalur = readln()

            if (jalur == "1") {
                println("Kamu berada disebuah ruangan dengan tiga patung (1, 2, atau 3)")
                println("1. Naga")
                println("2. Griffin")
                println("3. Ular")
                val patung = readln()

                when (patung) {
                    "1" -> {
                        kesehatanPemain = (kesehatanPemain - 35).toByte()
                        println("Patung Naga mengeluarkan api! Kamu kehilangan 35 kesehatan.")

                        println("Mau gunakan poison +10 (y/n)")
                        val usePoison = readln()

                        if (usePoison == "y" && jumlahPotion > 0) {
                            jumlahPotion -= 1
                            kesehatanPemain = (kesehatanPemain + 10).toByte()
                        }
                    }

                    "2" -> {
                        punyaKunciEmas = true
                        println("Kamu menemukan Kunci Emas di balik patung Griffin!")
                    }

                    "3" -> {
                        println("Patung Ular tidak melakukan apa-apa. Kamu membuang-buang waktu.")
                    }

                    else -> {
                        println("Tidak tahu")
                    }
                }

                if (punyaKunciEmas) {
                    println("Kamu menggunakan Kunci Emas dan membuka pintu. Di dalamnya, kamu menemukan artefak kuno! KAMU MENANG!")
                    sedangBermain = false
                } else {
                    println("Pintu ini terkunci dan membutuhkan Kunci Emas. Kamu tidak bisa melanjutkannya. GAME OVER.")
                }
            } else {
                kesehatanPemain = (kesehatanPemain - 25).toByte()
                println("Kamu menginjak perangkap dan health berkurang 25 poin")
                println("Mau gunakan poison +10 (y/n)")
                val usePoison = readln()

                if (usePoison == "y" && jumlahPotion > 0) {
                    jumlahPotion -= 1
                    kesehatanPemain = (kesehatanPemain + 10).toByte()
                }
            }
        }
    }
}