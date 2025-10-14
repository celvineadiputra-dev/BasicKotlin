package Basic

fun main() {
    val myInt: Int = 30000
    val myShort: Short = myInt.toShort()

    println(myShort)

    val myInt2: Int = 40000
    val myShort2: Short = myInt2.toShort()

    println(myShort2)

    println(Integer.toBinaryString(myInt2))
    /*
    * Kenapa -25536
    *
    * Tipe data short = 16bit
    * Rentang dari short = -32_768 s/d 32_767
    *
    * Integer.toBinaryString(myInt2)
    * Output : 10011100 01000000 (ambil 16bit terakhir)
    *
    * Notes :
    * Kalau bit pertama 0 -> maka postif
    * Kalu bit pertama 1 -> maka negatif
    *
    * Invert bit (1 -> 0, 0 -> 1)
    * 01100011 10111111 (convert jadi int 25535 + 1 = 25536)
    *
    * Karena bit pertama adalah 1 maka -25536
    * */
}