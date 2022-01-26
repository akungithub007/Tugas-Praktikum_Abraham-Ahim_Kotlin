package TugasPraktikum

fun main() {
    var mahasiswa: Mahasiswa = Mahasiswa("Baim")
    mahasiswa.sayHello("Nico")

    mahasiswa = Ketuakelas("Asran")
    mahasiswa.sayHello("Baim")

    mahasiswa = WakilKetuakelas("Nico")
    mahasiswa.sayHello("Asran")
}




