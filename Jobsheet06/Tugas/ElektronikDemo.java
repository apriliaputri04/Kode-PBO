package Jobsheet06.Tugas;

public class ElektronikDemo {
    public static void main(String[] args) {
        // Membuat objek Laptop menggunakan constructor tanpa parameter
        Laptop Lenovo = new Laptop();
        System.out.println("Info Laptop Lenovo:");
        System.out.println(Lenovo.getAllInfo());

        // Membuat objek Laptop menggunakan constructor berparameter
        Laptop Asus = new Laptop("Silver", "Asus", 800000, 2023, "Windows 10", 16);
        System.out.println("\nInfo Laptop Asus:");
        System.out.println(Asus.getAllInfo());

        // Membuat objek Handphone menggunakan constructor tanpa parameter
        Handphone handphone1 = new Handphone();
        System.out.println("\nInfo Handphone Oppo:");
        System.out.println(handphone1.getAllInfo());

        // Membuat objek Handphone menggunakan constructor berparameter
        Handphone Samsung = new Handphone("Hitam", "Samsung", 7000000, 2024, 6, 5000);
        System.out.println("\nInfo Handphone Samsung:");
        System.out.println(Samsung.getAllInfo());

        // Modifikasi nilai atribut dan cetak ulang informasi
        Asus.sistemOperasi = "11";
        Asus.harga = 9000000;
        Samsung.kapasitasBaterai = 6000;
        Samsung.harga = 5000000;

        System.out.println("\nSetelah Modifikasi Info Laptop Asus:");
        System.out.println(Asus.getAllInfo());

        System.out.println("\nSetelah Modifikasi Info Handphone Samsung:");
        System.out.println(Samsung.getAllInfo());
    }
}