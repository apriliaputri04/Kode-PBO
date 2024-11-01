package Jobsheet08;

public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
         return jenis; 
    }

    @Override
    public String getInfo() {
        return "-----Info Kipas-----\n" +
               "Merk    : " + getMerk() + "\n" +
               "Harga   : " + getHarga() + "\n" +
               "Warna   : " + getWarna() + "\n";
    }
}
