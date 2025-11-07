package NextOOP

enum class DayOfTheWeek2(val isWeekend: Boolean) {
    Monday(false),
    Tuesday(false),
    Wednesday(false),
    Thursday(false),
    Friday(false),
    Saturday(true),
    Sunday(true);
}

fun main() {
    val today = DayOfTheWeek2.Friday
    println("Hari ini : ${today.name}, Apakah weekend : ${today.isWeekend}")

    for (day in DayOfTheWeek2.values()) {
        println("${day.name}, is weekend : ${day.isWeekend}")
    }
}