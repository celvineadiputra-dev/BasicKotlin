package Basic

fun main() {
    val myInt : Int = 120
    val myByte : Byte = myInt.toByte()

    println(myByte)

    val myInt2 : Int = 130
    val myByte2 : Byte = myInt2.toByte()

    println(myByte2)
    /*
    * Kenapa -126
    *
    * Tipe data byte = 8bit
    * Rentang dari byte = -128 s/d 127
    *
    * Integer.toBinaryString(num)
    * Output : 10000010 (ambil 8bit terakhir)
    *
    * Notes :
    * Kalau bit pertama 0 -> maka postif
    * Kalu bit pertama 1 -> maka negatif
    *
    * Invert bit (1 -> 0, 0 -> 1)
    * 01111101 (convert jadi int 125 + 1 = 126)
    *
    * Karena bit pertama adalah 1 maka -126
    * */
}