package Quis2.Soal3;

public class Mobil extends Kendaraan {
    private int kecepatanMaks;

    public Mobil(String nama, int kapasitasPenumpang, int kecepatanMaks) {
        super(nama, kapasitasPenumpang);
        this.kecepatanMaks = kecepatanMaks;
    }

    @Override
    public void bergerak() {
        System.out.println(merk + " bergerak di jalan raya dengan kecepatan maksimum " + kecepatanMaks + " km/jam.");
    }

    public void isiBensin() {
        System.out.println(merk + " sedang mengisi bensin.");
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }
}