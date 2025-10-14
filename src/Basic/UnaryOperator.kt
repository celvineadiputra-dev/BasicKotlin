package Basic

fun main() {
    val a = 5
    val b = -a   // hasil: -5
    val c = +a   // hasil: 5 (tidak mengubah nilai, hanya menegaskan positif)

    var x = 10
    println(x++) // post-increment → cetak dulu (10), lalu x jadi 11
    println(++x) // pre-increment → x jadi 12 dulu, lalu cetak (12)
    println(x--) // post-decrement → cetak dulu (12), lalu x jadi 11
    println(--x) // pre-decrement → x jadi 10 dulu, lalu cetak (10)

    val isTrue = false
    val result = !isTrue   // hasil: true
}