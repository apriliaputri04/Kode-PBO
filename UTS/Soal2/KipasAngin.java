package UTS.Soal2;

public class KipasAngin extends Elektronik {
    private int kecepatan;
    private String tipeKipas;
    private boolean isDaya;

    public KipasAngin(String merek, String warna, String ukuran, double daya, 
                      int kecepatan, String tipeKipas) {
        super(merek, warna, ukuran, daya);
        this.kecepatan = kecepatan;
        this.tipeKipas = tipeKipas;
        this.isDaya = true; 
    }

    public String getInfo() { 
        return super.getAllInfo() + "\n" +
               "Kecepatan : " + kecepatan + "\n" +
               "Tipe Kipas : " + tipeKipas + "\n" +
               "Status Daya : " + (isDaya ? "Hidup" : "Mati");
    }
}