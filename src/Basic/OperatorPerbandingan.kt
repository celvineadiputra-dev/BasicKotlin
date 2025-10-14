package Basic

fun main() {
    val nilaiA = 20
    val nilaiB = 15

    val apakahLebihBesar = nilaiA > nilaiB
    println("Apakah nilaiA lebih besar dari nilaiB? $apakahLebihBesar") // Output: true

    val apakahSama = nilaiA == nilaiB
    println("Apakah nilaiA sama dengan nilaiB? $apakahSama") // Output: false

    val apakahTidakSama = nilaiA != (nilaiB + 5)
    println("Apakah nilaiA tidak sama dengan (nilaiB + 5)? $apakahTidakSama") // Output: false

    println("a" < "b")  // true
    println("apel" < "jeruk")  // true
    println("z" < "a")  // false
    println("ab" < "b") // true
    println("baa" > "azz") // true
}