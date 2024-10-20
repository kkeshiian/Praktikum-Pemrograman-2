package praktikum2.soal3;

//Pada baris ini, seharusnya nama class harus bernama 'Pegawai' agar sesuai petunjuk soal & sesuai nama file, sedangkan disini masih bernama 'Employee', sehingga mengakibatkan code tidak bisa di run
// public class Employee
public class Pegawai { 
    public String nama; 

    //pada baris ini seharusnya menggunakan tipe data String, bukan char
    // public char asal; 
    public String asal;
    public String jabatan; 

    //pada baris ini, variabel umur tidak ada value sehingga akan otomatis dianggap valuenya 0. Sehingga agar sesuai dengan output yang diharapkan, variabel umur harus diberi value terlebih dahulu
    // public int umur; 

    public int umur =17;
 
    public String getNama() { 
        return nama; 
    } 
 
    public String getAsal() { 
        return asal; 
    } 

    //pada baris ini terdapat kesalahan yaitu:
    //1. pada setJabatan, tidak ada parameter sama sekali, sedangkan pada file Soal3Main.java terdapat nilai "assasin".
    //2. kemudian pada bagian this.jabatan = j juga terdapat kesalahan, karena seharusnya this menunjuk variabel yang terdapat di parameter.

    // public void setJabatan() { 
    //     this.jabatan = j; 
    // }

    public void setJabatan(String jabatan) { 
        this.jabatan = jabatan; 
    } 
}