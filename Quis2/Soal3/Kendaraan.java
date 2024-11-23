package Quis2.Soal3;

public abstract class Kendaraan {
    protected String merk;
    protected int kapasitasPenumpang;

    public Kendaraan(String merk, int kapasitasPenumpang) {
        this.merk = merk;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public abstract void bergerak(); // Abstract method

    public String getmerk() {
        return merk;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
}