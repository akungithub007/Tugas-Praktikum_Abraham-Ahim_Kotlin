package TugasPraktikum

class Guru (val name:String) {
    fun guru(){
        println("Guru!")
    }
}


package TugasPraktikum

fun main() {
    val guru = Guru("Nama Gurunya adalah Munawir")
    println(guru.name)
}

//Ada 4 visibility modifier dikotlin yaitu: Publik, Private, Protected, dan yang terakhir itu Internal.
//visibility modifier yang saya gunakan diatas yaitu bersifat publik,yang artinya bisa diakses dari mana saja
