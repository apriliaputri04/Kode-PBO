package Quis2.Soal3;

public class Kapal extends Kendaraan {
    private double bobotKapal;

    public Kapal(String nama, int kapasitasPenumpang, double bobotKapal) {
        super(nama, kapasitasPenumpang);
        this.bobotKapal = bobotKapal;
    }

    @Override
    public void bergerak() {
        System.out.println(merk+ " bergerak di laut dengan bobot " + bobotKapal + " ton.");
    }

    public void tambatDiPelabuhan() {
        System.out.println(merk + " sedang tambat di pelabuhan.");
    }

    public double getBobotKapal() {
        return bobotKapal;
    }

    public void setBobotKapal(double bobotKapal) {
        this.bobotKapal = bobotKapal;
    }
}