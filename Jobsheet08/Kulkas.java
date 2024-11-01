package Jobsheet08;

public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
         return jumlahPintu; 
    }

    @Override
    public String getInfo() {
        return "-----Info Kulkas-----\n" +
               "Merk            : " + getMerk() + "\n" +
               "Harga           : " + getHarga() + "\n" +
               "Warna           : " + getWarna() + "\n" +
               "Jumlah Pintu    : " + jumlahPintu + "\n";
    }
}
