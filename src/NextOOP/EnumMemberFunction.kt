package NextOOP

enum class DayOfTheWeek3(val isWeekend: Boolean = false) {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday(true),
    Sunday(true);

    fun daysUntil(other: DayOfTheWeek3): Int {
        return if (this.ordinal < other.ordinal) {
            // Kasus sederhana: Jumat (4) - Senin (0) = 4
            other.ordinal - this.ordinal
        } else {
            // Kasus 'wrap-around': Senin (0) - Jumat (4) + 7 = 3
            other.ordinal - this.ordinal + DayOfTheWeek3.values().count()
        }
    }

    companion object {
        fun today(): DayOfTheWeek3 {
            // (Logika untuk mendapatkan hari ini dari kalender sistem)
            // Mari kita pura-pura hari ini Senin untuk contoh
            val calendarDayOfWeek = 0 // Ini akan jadi 0 untuk Senin setelah penyesuaian
            return DayOfTheWeek3.values().first { it.ordinal == calendarDayOfWeek }
//            return DayOfTheWeek3.values()[0]
        }
    }
}

fun main() {
    val today = DayOfTheWeek3.Monday
    val nextFriday = DayOfTheWeek3.Friday
    val daysLeft = today.daysUntil(nextFriday)

    println("\n--- Enum dengan Fungsi ---")
    println("Dari $today, ada $daysLeft hari sampai $nextFriday.") // Output: Dari Monday, ada 4 hari sampai Friday.

    val actualToday = DayOfTheWeek3.today()
    println("Fungsi 'today' dari companion object: $actualToday")
}