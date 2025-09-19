fun main() {
    println("Siapa nama kamu ?")
    val name = readln()

    println("Berapa umur kamu ?")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if (age != null) {
        println("Nama Kamu : $name")
        println("Umur kamu jika +10 : ${age + 10}")
    } else {
        println("Input umur tidak valid")
    }
}