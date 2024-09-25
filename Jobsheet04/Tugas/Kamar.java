package Jobsheet04.Tugas;

public class Kamar {
    private int nomorKamar;
    private String jenisKamar;
    private double hargaPerMalam;
    private String statusKamar;

    public Kamar(int nomorKamar, String jenisKamar, double hargaPerMalam, String statusKamar) {
        this.nomorKamar = nomorKamar;
        this.jenisKamar = jenisKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.statusKamar = statusKamar;
    }

    // Method untuk mendapatkan informasi kamar dalam bentuk String
    public String getInfo() {
        // Format hargaPerMalam tanpa komanya (bilangan bulat)
        return String.format("Nomor Kamar : %d, Jenis Kamar : %s, Harga Per Malam : %d, Status : %s", 
                nomorKamar, jenisKamar, (int) hargaPerMalam, statusKamar);
    }
}