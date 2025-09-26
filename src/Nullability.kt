fun main() {
    // Null
    var student : String? = "Student 1"
    println(student?.length)
    student = null

    // Safe Call Operator
    val prodiIf : String? = "IF"
    val prodiSi1 : String? = null
    println(prodiIf?.length)
    println(prodiSi1?.length)

    // Elvis Operator
    val prodiSi2 : String? = null
    println(prodiSi2 ?: "Tanpa prodi")

    // Not-null Assertion Operator
    val token: String? = null
    println(token!!.length)

    // Smart Cast
    val email: String? = "test@mail.com"
    if (email != null) {
        // Di dalam blok ini, `email` dianggap sebagai `String` (non-nullable)
        // Kita bisa memanggil .length tanpa ?.
        println("Panjang email: ${email.length}")
    }
}