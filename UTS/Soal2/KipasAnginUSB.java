package UTS.Soal2;

public class KipasAnginUSB extends KipasAngin {
    public String portUSB;
    public String fiturTambahan;
    public boolean dayaUSB;

    public KipasAnginUSB(String merek, String warna, String ukuran, double daya, 
                         int kecepatan, String tipeKipas, String portUSB, 
                         String fiturTambahan, boolean dayaUSB) {
        super(merek, warna, ukuran, daya, kecepatan, tipeKipas);
        this.portUSB = portUSB;
        this.fiturTambahan = fiturTambahan;
        this.dayaUSB = dayaUSB;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
               "Port USB : " + portUSB + "\n" +
               "Fitur Tambahan : " + fiturTambahan + "\n" +
               "Daya USB : " + (dayaUSB ? "Ada" : "Tidak Ada");
    }
}
