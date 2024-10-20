package praktikum2.soal1;

class Buah{
    String namaBuah;
    double beratSatuan;
    double hargaSatuan;
    double totalBerat;
    double hargaSebelumDiskon;
    double totalDiskon;
    double hargaSetelahDiskon;

    public Buah (String namaBuah, double beratSatuan, double hargaSatuan, double totalBerat){
        this.namaBuah = namaBuah;
        this.beratSatuan = beratSatuan;
        this.hargaSatuan = hargaSatuan;
        this.totalBerat = totalBerat;
    }

    public double hargaSebelumDiskonMethod(){
        return (totalBerat/beratSatuan) * hargaSatuan;
    }

    public double totalDiskonMethod(){
        return hargaSebelumDiskonMethod() * ((totalBerat/4) * 0.02);
    }

    public double hargaSetelahDiskonMethod(){
        return hargaSebelumDiskonMethod() - totalDiskonMethod();
    }

    public void cetakInfo(){
        System.out.println("\nNama Buah: " + namaBuah);
        System.out.println("Berat: " + beratSatuan);
        System.out.println("Harga: " + hargaSatuan);
        System.out.println("Jumlah Beli: " + totalBerat);
        System.out.println("Harga Sebelum Diskon: " + hargaSebelumDiskonMethod());
        System.out.println("Total Diskon: " + totalDiskonMethod());
        System.out.println("Harga Setelah Diskon: " + hargaSetelahDiskonMethod());
    }
}
public class PRAK201_2310813710011_MuhammadRizky {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0, 15.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0, 12.0);

        apel.cetakInfo();
        mangga.cetakInfo();
        alpukat.cetakInfo();


    }
}