package NextOOP

// Definisi enum
enum class DayOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun main() {
    // 1️⃣ Menggunakan values() untuk mendapatkan semua nilai enum
    val days = DayOfTheWeek.values()
    println("Semua hari dalam seminggu:")
    for (day in days) {
        println("${day.ordinal} - ${day.name}")
    }

    println("---------------")

    // 2️⃣ Mengambil nilai enum berdasarkan nama string dengan valueOf()
    val today = DayOfTheWeek.valueOf("FRIDAY")
    println("Hari ini adalah: $today")

    println("---------------")

    // 3️⃣ Mengakses properti name dan ordinal
    println("Nama enum: ${today.name}")      // Output: FRIDAY
    println("Urutan enum (ordinal): ${today.ordinal}") // Output: 5 (karena dimulai dari 0)

    println("---------------")

    // 4️⃣ Contoh penggunaan dalam when expression
    when (today) {
        DayOfTheWeek.SATURDAY, DayOfTheWeek.SUNDAY -> println("Hari libur")
        else -> println("Hari kerja")
    }
}