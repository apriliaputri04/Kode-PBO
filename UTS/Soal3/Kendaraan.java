package UTS.Soal3;

public class Kendaraan {
    public int id;
    public String jenis;
    public String merek;
    public String bahanBakar;
    public int tahun;

    public Kendaraan(int id, String jenis, String merek, String bahanBakar, int tahun) {
        this.id = id;
        this.jenis = jenis;
        this.merek = merek;
        this.bahanBakar = bahanBakar;
        this.tahun = tahun;
    }

    public int getId() {
        return id;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String displayInfo() {
        return "ID: " + id + ", Merek: " + merek + ", Jenis: " + jenis + ", Bahan Bakar: " + bahanBakar + ", Tahun: " + tahun;
    }
}
