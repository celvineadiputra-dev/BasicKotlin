fun main() {
    val NAMA_PETUALANG : String = "Celvine"
    val KAPASITAS_TAS : Double = 20.0
    var totalBeratBawaan : Double = 0.0

    for (i in 1..3) {
        println("--------- Memasukkan Barang #$i ---------")

        print("Nama Barang : ")
        val namaBarang : String = readln()

        print("Berat Barang '$namaBarang' (kg): ")
        val beratBarang : Double = readln().toDoubleOrNull() ?: 0.0

        totalBeratBawaan += beratBarang

        println("'$namaBarang' dengan berat $beratBarang kg telah ditambahkan")
        if(totalBeratBawaan > KAPASITAS_TAS) {
            println("Bahaya, Kelebihan Muatan! Berat saat ini : $totalBeratBawaan kg. Kapasitas hanya $KAPASITAS_TAS kg.")
            break
        } else if(totalBeratBawaan == KAPASITAS_TAS) {
            println("Optimal! Tas milik $NAMA_PETUALANG sekarang penuh dengan sempurna.")
            break
        } else {
            println("Barang berhasil dimasukkan. Sisa kapasitas tas: ${KAPASITAS_TAS - totalBeratBawaan} kg")
        }
    }

    println("Proses kalkulasi logistik selesai.")
}