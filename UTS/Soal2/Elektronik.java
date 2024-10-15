package UTS.Soal2;

public class Elektronik {
    public String merek;
    public String warna;
    public String ukuran;
    public double daya;

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
