package OOP

fun main() {
    val person = object {
        val name = "Andi"
        val age = 20
        fun greet() = "Halo, nama saya $name, umur $age tahun."
    }

    println(person.greet())
}
