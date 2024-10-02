package Jobsheet06.Tugas;

public class ElektronikDemo {
    public static void main(String[] args) {
        // Membuat objek Laptop menggunakan constructor tanpa parameter
        Laptop laptop1 = new Laptop();
        System.out.println("Info Laptop 1:");
        System.out.println(laptop1.getInfo());

        // Membuat objek Laptop menggunakan constructor berparameter
        Laptop laptop2 = new Laptop("Silver", "Asus", 15000000, 2023, "Windows 11", 16);
        System.out.println("\nInfo Laptop 2:");
        System.out.println(laptop2.getInfo());

        // Membuat objek Handphone menggunakan constructor tanpa parameter
        Handphone handphone1 = new Handphone();
        System.out.println("\nInfo Handphone 1:");
        System.out.println(handphone1.getInfo());

        // Membuat objek Handphone menggunakan constructor berparameter
        Handphone handphone2 = new Handphone("Hitam", "Samsung", 7000000, 2024, 6, 5000);
        System.out.println("\nInfo Handphone 2:");
        System.out.println(handphone2.getInfo());

        // Modifikasi nilai atribut dan cetak ulang informasi
        laptop2.merek = "HP";
        laptop2.harga = 14000000;
        handphone2.kapasitasBaterai = 6000;

        System.out.println("\nSetelah Modifikasi Info Laptop 2:");
        System.out.println(laptop2.getInfo());

        System.out.println("\nSetelah Modifikasi Info Handphone 2:");
        System.out.println(handphone2.getInfo());
    }
}