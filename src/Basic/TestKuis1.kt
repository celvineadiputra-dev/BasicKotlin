package Basic

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.regex.Pattern

class KurirMainTest {

    private fun runProgramWithInput(input: String): String {
        val inputStream = ByteArrayInputStream(input.toByteArray())
        val outputStream = ByteArrayOutputStream()
        val originalIn = System.`in`
        val originalOut = System.out

        System.setIn(inputStream)
        System.setOut(PrintStream(outputStream))

        try {
            Kuis1()
        } catch (e: Exception) {
            return "Program error: ${e.message}"
        } finally {
            System.setIn(originalIn)
            System.setOut(originalOut)
        }

        return outputStream.toString().trim()
            .replace(Regex("Rp\\s?"), "")
            .replace(Regex("[,.]"), "")
    }

    private fun assertOutputContains(label: String, expectedValue: String, programOutput: String) {
        val pattern = Pattern.compile("(?i)$label\\s*:?\\s*$expectedValue")
        val matcher = pattern.matcher(programOutput)
        assertTrue(
            "Output tidak mengandung '$label' dengan nilai '$expectedValue'.\nOutput Program:\n---\n$programOutput\n---",
            matcher.find()
        )
    }

    @Test
    fun `test input normal - Gold Member Efisien`() {
        val input = """
            Andi
            85
            8.5
            4.8
            Gold
        """.trimIndent()

        val output = runProgramWithInput(input)

        // Kalkulasi manual:
        // Insentif Pokok: 85 * 2500 = 212500
        // Bonus Efisiensi: >75 paket (ya), <8 jam (tidak) -> Efisien = 75000
        // Bonus Kepuasan: rating 94.8 -> 100000
        // Sub-total: 212500 + 75000 + 100000 = 387500
        // Total Akhir: 387500 * 1.2 (Gold) = 465000

        assertOutputContains("Nama Kurir", "Andi", output)
        assertOutputContains("Insentif Pokok", "212500", output)
        assertOutputContains("Bonus Efisiensi", "75000", output)
        assertOutputContains("Bonus Kepuasan", "100000", output)
        assertOutputContains("Subtotal Insentif", "387500", output) // Opsional, tapi baik untuk diperiksa
        assertOutputContains("Total Insentif Akhir", "465000", output)
    }

    @Test
    fun `test bonus Sangat Efisien`() {
        val input = """
            Budi
            90
            7.5
            4.0
            Silver
        """.trimIndent()
        val output = runProgramWithInput(input)
        // Kalkulasi: >75 paket (ya), <8 jam (ya) -> Sangat Efisien = 150000
        assertOutputContains("Bonus Efisiensi", "150000", output)
    }

    @Test
    fun `test tidak ada bonus efisiensi (tepat di batas)`() {
        val input = """
            Citra
            75
            8.0
            4.0
            Bronze
        """.trimIndent()
        val output = runProgramWithInput(input)
        // Kalkulasi: >75 paket (tidak), <8 jam (tidak) -> Bonus = 0
        // Memastikan bonus 75000 atau 150000 tidak muncul.
        assertFalse("Seharusnya tidak ada bonus efisiensi (75000)", output.contains("75000"))
        assertFalse("Seharusnya tidak ada bonus efisiensi (150000)", output.contains("150000"))
    }

    @Test
    fun `test rating batas bawah bonus 100k (rating 4,5)`() {
        val input = """
            Dedi
            80
            8.0
            4.5
            Gold
        """.trimIndent()
        val output = runProgramWithInput(input)
        assertOutputContains("Bonus Kepuasan", "100000", output)
    }

    @Test
    fun `test rating batas atas bonus 50k (rating 4,49)`() {
        val input = """
            Eka
            80
            8.0
            4.49
            Gold
        """.trimIndent()
        val output = runProgramWithInput(input)
        assertOutputContains("Bonus Kepuasan", "50000", output)
    }

    @Test
    fun `test rating batas bawah bonus 50k (rating 4,0)`() {
        val input = """
            Fani
            80
            8.0
            4.0
            Gold
        """.trimIndent()
        val output = runProgramWithInput(input)
        assertOutputContains("Bonus Kepuasan", "50000", output)
    }

    @Test
    fun `test tidak ada bonus rating (rating 3,99)`() {
        val input = """
            Gita
            80
            8.0
            3.99
            Gold
        """.trimIndent()
        val output = runProgramWithInput(input)
        // Memastikan bonus 50000 atau 100000 tidak muncul.
        assertFalse("Seharusnya tidak ada bonus kepuasan (50000)", output.contains("50000"))
        assertFalse("Seharusnya tidak ada bonus kepuasan (100000)", output.contains("100000"))
    }

    @Test
    fun `test status keanggotaan case insensitive`() {
        val input = """
            Hadi
            80
            8.5
            4.6
            silver
        """.trimIndent() // Menggunakan huruf kecil "silver"

        val output = runProgramWithInput(input)

        // Kalkulasi:
        // Insentif Pokok: 80 * 2500 = 200000
        // Bonus Efisiensi: >75 (ya), <8 (tidak) -> 75000
        // Bonus Kepuasan: 4.6 -> 100000
        // Sub-total: 200000 + 75000 + 100000 = 375000
        // Total Akhir: 375000 * 1.1 (Silver) = 412500
        assertOutputContains("Total Insentif Akhir", "412500", output)
    }

    @Test
    fun `test jumlah paket tidak valid (negatif)`() {
        val input = """
            Budi
            -5
            7
            4.5
            Silver
        """.trimIndent()
        val output = runProgramWithInput(input)
        // Program yang baik seharusnya menampilkan pesan error atau tidak menghitung nilai negatif
        assertFalse("Output tidak boleh mengandung angka negatif '-5'", output.contains("-5"))
        assertFalse("Perhitungan insentif tidak boleh negatif '-12500'", output.contains("-12500"))
    }

    @Test
    fun `test rating invalid (di luar rentang)`() {
        val input = """
            Citra
            60
            8
            6
            Gold
        """.trimIndent()
        val output = runProgramWithInput(input)
        assertFalse("Seharusnya tidak ada bonus untuk rating invalid", output.contains("Bonus Kepuasan: 100000"))
        assertFalse("Seharusnya tidak ada bonus untuk rating invalid", output.contains("Bonus Kepuasan: 50000"))
    }

    @Test
    fun `test status keanggotaan tidak valid`() {
        val input = """
            Dedi
            70
            7
            4.5
            Platinum
        """.trimIndent()
        val output = runProgramWithInput(input)
        // Test ini memastikan tidak ada pengali bonus yang salah diterapkan.
        assertFalse("Tidak boleh ada pengali Gold untuk status invalid", output.contains("1.2"))
        assertFalse("Tidak boleh ada pengali Silver untuk status invalid", output.contains("1.1"))
    }
}