package Jobsheet06;

public class Pegawai {
    public String nip;
    public String nama;
    private double gaji;

    public Pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public String getInfo() {
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";

        return info;
    }
}