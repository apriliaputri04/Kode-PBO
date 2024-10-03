package Jobsheet06.Tugas;

// Child Class: Handphone
public class Handphone extends Elektronik {
    private int ukuranLayar;
    private int kapasitasBaterai;

    // Constructor tanpa parameter
    public Handphone() {
        super();
        this.ukuranLayar = 0;
        this.kapasitasBaterai = 0;
    }

    // Constructor berparameter
    public Handphone(String warna, String merek, double harga, int tahunProduksi, int ukuranLayar, int kapasitasBaterai) {
        super(warna, merek, harga, tahunProduksi);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Method overloading
    public void modifikasiHandphone(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public void modifikasiHandphone(int ukuranLayar, int kapasitasBaterai) {
        this.ukuranLayar = ukuranLayar;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Method untuk menampilkan informasi Handphone
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Ukuran Layar      : " + ukuranLayar + " inch");
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " mAh");
    }
}