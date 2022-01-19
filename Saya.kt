package TugasPraktikum

class Saya {

    var NamaPanjang: String = ""
    var NamaPendek: String = ""

    fun katakanHalo(nama: String) {
        println("Halo $nama, Nama saya adalah $NamaPanjang")
    }

}

open class Ucapan {
    fun pesan () {
        print("Selamat Belajar Baim")
    }
}
class Selamat: Ucapan(){
}
fun main() {
    var  view = Selamat()
    view.pesan()
}
//Jadi Method/Function yang saya buat,saya masukkan kedalam class(Saya) yg sudah saya buat.
//jadi function diatas yaitu katakanHalo,dengan parameter nama,kemudian tipe datanya String.
//Kemudian menggunakan println yaitu perintah untuk menampilkan output Halo $nama(Nico), Nama saya adalah $NamaPanjang(Abraham Ahim W).