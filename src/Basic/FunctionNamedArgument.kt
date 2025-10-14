package Basic

fun calculate(
    tugas1: Double, tugas2: Double, kuis1: Double, kuis2: Double, uts: Double, uas: Double
) {
    print("Basic.sum ${tugas1 + tugas2 + kuis1 + kuis2 + uts + uas}")
}

fun main() {
    calculate(
        tugas1 = 20.0, kuis1 = 50.0, kuis2 = 80.4, tugas2 = 30.4, uts = 80.8, uas = 90.2
    )
}