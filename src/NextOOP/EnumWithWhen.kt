package NextOOP

fun main() {
    val today = DayOfTheWeek2.Friday

    when (today) {
        DayOfTheWeek2.Monday -> println("Ugh, hari Senin.")
        DayOfTheWeek2.Friday -> println("Asyik, hari Jumat!")
        DayOfTheWeek2.Saturday, DayOfTheWeek2.Sunday -> println("Waktunya akhir pekan!")
        else -> println("Hari biasa.") // 'else' untuk hari-hari lain
    }
}