package Basic

fun main() {
    val range = 0..1000
    val rangeChar = 'a'..'o'
    val rangeUntil = 1 until 10
    val rangeDownTo = 10 downTo 0

    println(range.count())
    println(rangeDownTo.contains(66))

    val rangeStep = 0..100 step 2
    val rangeStepDownTo = 1000 downTo 0 step 2

    println(rangeStep.first)
    println(rangeStepDownTo.last)
    println(rangeStep.step)
}