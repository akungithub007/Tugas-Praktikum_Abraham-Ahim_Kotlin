package TugasPraktikum

fun main() {
    val lokasi = Lokasi("Antang") //error
    val kota = Kota("Saya tinggal di kota Makassar")
    val asal = Asal("Saya berasal dari Toraja")

    println(kota.name)
    println(asal.name)
}

//Disini saya membuat class Lokasi dan menjadikannya abstract class.
//Abstract class disini tidak bisa dibuatkan objeknya secara langsung karena akan terjadi error saat di running (val lokasi = Lokasi("Antang").
//Maka saya membuat class turunannya yaitu Kota dan asal.