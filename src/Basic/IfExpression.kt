package Basic

fun main() {
    val finalExamPoint : Float = 90.88F

    if(finalExamPoint > 90) {
        println("You passed the Kotlin class")
    } else if(finalExamPoint > 80) {
        println("Passed as second reserve candidate")
    } else {
        println("You didn't meet the passing criteria this time.")
    }
}