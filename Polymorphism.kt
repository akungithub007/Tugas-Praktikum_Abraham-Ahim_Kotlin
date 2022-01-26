package TugasPraktikum

fun main() {
    var mahasiswa: Mahasiswa = Mahasiswa("Baim")
    mahasiswa.sayHello("Nico")

    mahasiswa = Ketuakelas("Asran")
    mahasiswa.sayHello("Baim")

    mahasiswa = WakilKetuakelas("Nico")
    mahasiswa.sayHello("Asran")
}

//Polymorphism yaitu kemampuan untuk merubah bentuk.
//Jadi disini saya merubah dari Mahasiswa menjadi Ketuakelas,begitupun seterusnya.
//Maka ketika kita running,maka hasilnya akan berubah bentuk dari seebelumnya.
//Walaupun mahasiswa.sayHello nya tetap sama,tapi karena dia berubah bentuk,maka behaviornya juga akan berubah.


