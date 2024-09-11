package Jobsheet02;

import java.util.Scanner;

public class KipasAngin {
    private String merk;
    private String warna;
    private int kecepatan;

    public KipasAngin(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void tambahKecepatan(int nilai) {
        kecepatan += nilai;
    }

    public void kurangiKecepatan(int nilai) {
        kecepatan -= nilai;
    }

    public void tampilkanInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Warna        : " + warna);
        System.out.println("Kecepatan    : " + kecepatan);
    }

    public int getKecepatan() {
        return kecepatan;
    }
}
