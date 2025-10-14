package Basic

fun main() {
    // default dari trimMargin menggunakan prefix pipe "|"
    val address : String = """
        |Jln. Rajawali
        |Sumatra Selatan
        |Palembang
    """.trimMargin()

    println(address)
}