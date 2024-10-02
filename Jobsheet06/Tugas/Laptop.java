package Jobsheet06.Tugas;

// Child Class: Laptop
public class Laptop extends Elektronik {
    public String sistemOperasi;
    public int kapasitasRAM;

    // Constructor tanpa parameter (Overloading)
    public Laptop() {
        super();  // Memanggil constructor tanpa parameter dari class parent
        this.sistemOperasi = "Tidak diketahui";
        this.kapasitasRAM = 0;
    }

    // Constructor berparameter (Overloading)
    public Laptop(String warna, String merek, double harga, int tahunProduksi, String sistemOperasi, int kapasitasRAM) {
        super(warna, merek, harga, tahunProduksi);  // Memanggil constructor berparameter dari class parent
        this.sistemOperasi = sistemOperasi;
        this.kapasitasRAM = kapasitasRAM;
    }

    // Method untuk menampilkan info Laptop
    @Override
    public String getInfo() {
        return super.getAllInfo() + "\nSistem Operasi: " + sistemOperasi + "\nKapasitas RAM: " + kapasitasRAM + " GB";
    }
}