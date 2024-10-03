package Jobsheet06.Tugas;

// Child Class: Laptop
public class Laptop extends Elektronik {
    private String sistemOperasi;
    private int kapasitasRAM;

    // Constructor tanpa parameter
    public Laptop() {
        super();
        this.sistemOperasi = "Tidak diketahui";
        this.kapasitasRAM = 0;
    }

    // Constructor berparameter
    public Laptop(String warna, String merek, double harga, int tahunProduksi, String sistemOperasi, int kapasitasRAM) {
        super(warna, merek, harga, tahunProduksi);
        this.sistemOperasi = sistemOperasi;
        this.kapasitasRAM = kapasitasRAM;
    }

    // Method overloading
    public void modifikasiLaptop(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public void modifikasiLaptop(String sistemOperasi, int kapasitasRAM) {
        this.sistemOperasi = sistemOperasi;
        this.kapasitasRAM = kapasitasRAM;
    }

    // Method untuk menampilkan informasi Laptop
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sistem Operasi : " + sistemOperasi);
        System.out.println("Kapasitas RAM  : " + kapasitasRAM + " GB");
    }
}