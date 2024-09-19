package Jobsheet04.Tugas;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Tamu
        Tamu tamu1 = new Tamu("Aprilia Putri Anggraeni", "097154", "085755798671", "Jl. Semanggi Barat No.14");

        // Menambah reservasi dan kamar
        tamu1.tambahReservasi("RES001", LocalDateTime.of(2021, 8, 11, 18, 0), LocalDateTime.of(2021, 8, 15, 12, 0), "Confirmed");
        tamu1.tambahKamarKeReservasi(0, 101, "Deluxe", 500000, "Available");
        tamu1.tambahKamarKeReservasi(0, 102, "Superior", 400000, "Available");


        // Membuat objek Tamu tanpa reservasi
        Tamu tamu2 = new Tamu("Meisy Nadia Nababan", "675431", "085781094478", "Jalan Senggani No.35");

        // Menampilkan reservasi
        tamu1.tampilkanReservasi();
        tamu2.tampilkanReservasi();
    }
}