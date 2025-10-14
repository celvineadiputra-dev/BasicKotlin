package Basic

fun main() {
    // custom prefix dari trim margin
    val address : String = """
        +Jln. Rajawali
        +Sumatra Selatan
        +Palembang
    """.trimMargin("+")

    println(address)
}