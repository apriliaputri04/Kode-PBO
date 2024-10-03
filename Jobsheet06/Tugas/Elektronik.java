package Jobsheet06.Tugas;

// Parent Class: Elektronik
public class Elektronik {
    public String warna;
    public String merek;
    public double harga;
    public int tahunProduksi;

    // Constructor tanpa parameter
    public Elektronik() {
        this.warna = "Tidak diketahui";
        this.merek = "Tidak diketahui";
        this.harga = 0.0;
        this.tahunProduksi = 0;
    }

    // Constructor berparameter
    public Elektronik(String warna, String merek, double harga, int tahunProduksi) {
        this.warna = warna;
        this.merek = merek;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }

    // Method untuk menampilkan informasi elektronik
    public void printInfo() {
        System.out.println("Warna          : " + warna);
        System.out.println("Merek          : " + merek);
        System.out.println("Harga          : Rp. " + harga);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }

    // Method overloading
    public void modifikasiElektronik(String warna) {
        this.warna = warna;
    }

    public void modifikasiElektronik(String warna, double harga) {
        this.warna = warna;
        this.harga = harga;
    }
}