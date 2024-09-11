package Jobsheet02;

import java.util.Scanner;

public class KipasAnginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan informasi untuk Kipas Angin 1:");
        System.out.print("Merk         : ");
        String merk1 = scanner.nextLine();
        System.out.print("Warna        : ");
        String warna1 = scanner.nextLine();
        System.out.print("Kecepatan    : ");
        int kecepatan1 = scanner.nextInt();
        scanner.nextLine(); 

        KipasAngin kipas1 = new KipasAngin(merk1, warna1, kecepatan1);
        kipas1.tampilkanInfo();
        System.out.print("Tambah Kecepatan : ");
        int tambahKecepatan1 = scanner.nextInt();
        kipas1.tambahKecepatan(tambahKecepatan1);
        System.out.println("Kecepatan setelah ditambah : " + kipas1.getKecepatan());
        scanner.nextLine(); 
        System.out.println();

        System.out.println("Masukkan informasi untuk Kipas Angin 2:");
        System.out.print("Merk         : ");
        String merk2 = scanner.nextLine();
        System.out.print("Warna        : ");
        String warna2 = scanner.nextLine();
        System.out.print("Kecepatan    : ");
        int kecepatan2 = scanner.nextInt();
        scanner.nextLine();

        KipasAngin kipas2 = new KipasAngin(merk2, warna2, kecepatan2);
        kipas2.tampilkanInfo();
        System.out.print("Kurangi Kecepatan:");
        int kurangiKecepatan2 = scanner.nextInt();
        kipas2.kurangiKecepatan(kurangiKecepatan2);
        System.out.print("Kecepatan setelah dikurangi: " + kipas2.getKecepatan());

        scanner.close();
    }
}