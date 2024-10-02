package Jobsheet06.Tugas;

// Parent Class: Elektronik
public class Elektronik {
    public String warna;
    public String merek;
    public double harga;
    public int tahunProduksi;

    // Constructor tanpa parameter (Overloading)
    public Elektronik() {
        this.warna = "Tidak diketahui";
        this.merek = "Tidak diketahui";
        this.harga = 0.0;
        this.tahunProduksi = 0;
    }

    // Constructor berparameter (Overloading)
    public Elektronik(String warna, String merek, double harga, int tahunProduksi) {
        this.warna = warna;
        this.merek = merek;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }

    // Method untuk menampilkan info elektronik
    public String getAllInfo() {
        return "Warna: " + warna + "\nMerek: " + merek + "\nHarga: Rp. " + harga + "\nTahun Produksi: " + tahunProduksi;
    }
}