package Jobsheet06.Tugas;

// Child Class: Handphone
public class Handphone extends Elektronik {
    public int ukuranLayar;
    public int kapasitasBaterai;

    // Constructor tanpa parameter (Overloading)
    public Handphone() {
        super();  // Memanggil constructor tanpa parameter dari class parent
        this.ukuranLayar = 0;
        this.kapasitasBaterai = 0;
    }

    // Constructor berparameter (Overloading)
    public Handphone(String warna, String merek, double harga, int tahunProduksi, int ukuranLayar, int kapasitasBaterai) {
        super(warna, merek, harga, tahunProduksi);  // Memanggil constructor berparameter dari class parent
        this.ukuranLayar = ukuranLayar;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Method untuk menampilkan info Handphone
    @Override
    public String getAllInfo() {
        return super.getAllInfo() + "\nUkuran Layar: " + ukuranLayar + " inch" + "\nKapasitas Baterai: " + kapasitasBaterai + " mAh";
    }
}