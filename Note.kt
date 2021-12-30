package TugasPraktikum

class Note(title: String){
    var title: String = title
    get() {
        println("Panggil fungsi getter")
        return field
    }
    set(value) {
        println("Panggil fungsi setter")
        if (value.isNotBlank()) {
            field = value
        }
    }


}
// kalau di kotlin.Saat kita membuat properties,disini saya menggunakan var yg artinya datanya bisa berubah.
//tergantung tipe propertiesnya,kalau var bisa definisikan get & set,tapi kalau val hanya get saja karena val immutable.
//jadi kata kunci field diatas gunanya untuk mengembalikan kembali data var title.
//lalu di set ada kata (value),itu tidak perlu kita definisikan tipe datanya karena secara otomatis akan sama dengan variabel diatas.
//untuk kata if di bagian setnya itu fungsinya untuk melakukan validasi.
//dan isNotBlank diatas itu artinya valuenya tidak kosong baru kita set.