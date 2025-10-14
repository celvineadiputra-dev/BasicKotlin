package Basic

fun main() {
    val finalExam = 'D'
    val passValues = arrayOf('A', 'B')

    when(finalExam) {
        'A' -> println("Passed")
        'B' -> println("Not Bad")
        'C' -> println("Try Again Next Year")
        else -> println("Ha ?")
    }

    when(finalExam) {
        'A', 'B' -> println("Passed")
        'C' -> println("Try Again Next Year")
        else -> println("Ha ?")
    }

    when(finalExam) {
        in passValues -> println("Passed")
        !in passValues -> println("Try Again Next Year")
    }

    when(finalExam) {
        is Char -> {
            println("Is Char")
        }
        !is Char -> println("Not Char")
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Passed")
        finalExam == 'C' -> println("Try Again Next Year")
        else -> println("Hah ?")
    }

    val status = when(finalExam) {
        'A', 'B' -> "Passed"
        'C' -> "Try Again Next Year"
        else -> "Ha ?"
    }

    println(status)
}