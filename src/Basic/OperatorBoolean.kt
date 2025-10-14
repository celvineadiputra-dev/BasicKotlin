package Basic

fun main() {
    val nilaiKuis = 70
    val nilaiTugas1 = 80
    val nilaiTugas2 = 81
    val nilaiUts = 20
    val nilaiUas = 100
    val jumlahPresensi = 76

    val lulusKuis = nilaiKuis > 76
    val lulusTugas1 = nilaiTugas1 > 90
    val lulusTugas2 = nilaiTugas2 > 90
    val lulusUts = nilaiUts > 80
    val lulusUas = nilaiUas > 80
    val lulusPresensi = jumlahPresensi > 75

    val lulus = lulusKuis && lulusTugas1 && lulusTugas2 && lulusUts && lulusUas && lulusPresensi

    println("You : $lulus")
}