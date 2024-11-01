package Jobsheet08;

public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;
    private int volume;

    public TV(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() { 
        return jenisLayar; 
    }

    public int getVolume() {
         return volume; 
    }

    @Override
    public void naikkanVolume(int increment) { 
        volume += increment; 
    }
    @Override
    public void turunkanVolume(int decrement) { 
        volume -= decrement; 
    }

    @Override
    public String getInfo() {
        return "-----Info TV-----\n" +
               "Merk        : " + getMerk() + "\n" +
               "Harga       : " + getHarga() + "\n" +
               "Warna       : " + getWarna() + "\n" +
               "Jenis Layar : " + jenisLayar + "\n" +
               "Volume      : " + volume + "\n";
    }
}
