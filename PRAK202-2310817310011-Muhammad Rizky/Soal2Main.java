package praktikum2.soal2;

class Kopi{
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;

    public void info(){
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }

    public void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }

    public String getPembeli(){
        return pembeli;
    }

    public double getPajak(){
        return harga * 0.11;
    }

}

public class Soal2Main {
    public static void main(String[] args) {
        Kopi kopi1 = new Kopi(); 
        kopi1.namaKopi = "Espresso"; 
        kopi1.ukuran = "Medium"; 
        kopi1.harga = 25000; 
 
        kopi1.info(); 
        kopi1.setPembeli("Alice"); 
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli()); 
        System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak());
    }
}
