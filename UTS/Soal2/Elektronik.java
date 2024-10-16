package UTS.Soal2;

public class Elektronik {
    protected String merek;
    protected String warna;
    protected String ukuran;
    protected double daya;

    public Elektronik(String merek, String warna, String ukuran, double daya) {
        this.merek = merek;
        this.warna = warna;
        this.ukuran = ukuran;
        this.daya = daya;
    }

    public String getAllInfo() {
        return "Merek : " + merek + "\n" +
               "Warna : " + warna + "\n" +
               "Ukuran : " + ukuran + "\n" +
               "Daya : " + daya + "W";
    }
}