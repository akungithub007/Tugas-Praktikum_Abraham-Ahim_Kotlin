package TugasPraktikum

import java.time.Year

class Motorcycle (paramTipe: String, paramTahun: Int= 2015){
    var tipe: String = paramTipe
    var tahun: Int = paramTahun

}

//Untuk membuat kelas di kotlin itu sangat simple,hanya menggunakan kata kunci class.
//Contohnya diatas saya membuat class Motorcycle.
//Kemudian ada Propertinya yaitu tipe & var tahun dengan tipe data String dan Integer,valuenya paramTipe & paramTahun.
//Untuk constraktor,kita bisa membuatnya didalam class kotlin dengan menambahkan parameter didalamnya.
//contoh diatas saya membuat constractor didalam class Motorcycle.
//untuk menandakan constructornya maka saya menggunakan parameter pada codenya(paramTipe: String,paramTahun: Int= 2015).