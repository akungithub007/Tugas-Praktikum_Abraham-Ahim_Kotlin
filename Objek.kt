package TugasPraktikum

fun main(args: Array<String>) {
    println("Masukkan nama user : ")
    val user = readLine()!!.toByteArray()
    println("Type Motor & Tahun Keluaran")

    val yamaha = Motorcycle( "Mx King")
    val honda = Motorcycle("Beat", 2012)
    val suzuki = Motorcycle("Satria",2010)

    println(yamaha.tipe)
    println(yamaha.tahun)
    println(honda.tipe)
    println(honda.tahun)
    println(suzuki.tipe)
    println(suzuki.tahun)
}

//untuk membuat objek di kotlin itu,kita tidak perlu membuat kata kunci khusus seperti dijava yang menggunakan kata new.
//Kalau dikotlin kita cuma perlu memanggil kelasnya,misalnya tadi saya panggil class Motorcycle,maka itu akan terhubung.
//Contohnya diatas saya membuat variabel(val yamaha = Motorcycle)secara otomatis akan membuat objek yamaha,honda,suzuki.
//dan code diatas,Saya menggunakan user input.
//untuk output diatas menggunakan code println,jadi ketika kita run programnya maka akan keluar output sesuai perintah.
//untuk menandakan construktornya,saya menggunakan parameter(paramTipe dan paramTahun).
//contoh diatas paramTipe Mx King,dst.