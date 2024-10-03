package Jobsheet06.Tugas;

public class ElektronikDemo {
    public static void main(String[] args) {
        // Membuat objek Laptop
        Laptop laptop1 = new Laptop("Silver", "Asus", 8000000, 2023, "Windows 10", 16);
        System.out.println("Informasi Laptop Sebelum Modifikasi : ");
        laptop1.printInfo();
        
        // Modifikasi Laptop
        laptop1.modifikasiElektronik("Black", 9000000); // Dari parent class
        laptop1.modifikasiLaptop("Windows 11", 32); // Dari child class
        System.out.println("\nInformasi Laptop Setelah Modifikasi : ");
        laptop1.printInfo();

        System.out.println();

        // Membuat objek Handphone
        Handphone handphone1 = new Handphone("Hitam", "Samsung", 7000000, 2024, 6, 5000);
        System.out.println("Informasi Handphone Sebelum Modifikasi : ");
        handphone1.printInfo();

        // Modifikasi Handphone
        handphone1.modifikasiElektronik("Blue", 5000000); // Dari parent class
        handphone1.modifikasiHandphone(7, 6000); // Dari child class
        System.out.println("\nInformasi Handphone Setelah Modifikasi : ");
        handphone1.printInfo();
    }
}