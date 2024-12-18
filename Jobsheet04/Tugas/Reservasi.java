package Jobsheet04.Tugas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;  // Mengimpor kelas ArrayList untuk menyimpan daftar kamar

public class Reservasi {
    private String nomorReservasi;
    private LocalDateTime tanggalCheckIn;
    private LocalDateTime tanggalCheckOut;
    private String status;
    private ArrayList<Kamar> daftarKamar;

    //Membuat formatter untuk format tanggal dan waktu yang lebih mudah dibaca
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // Konstruktor untuk inisialisasi objek Reservasi
    public Reservasi(String nomorReservasi, LocalDateTime tanggalCheckIn, LocalDateTime tanggalCheckOut, String status) {
        this.nomorReservasi = nomorReservasi;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        this.status = status;
        this.daftarKamar = new ArrayList<>();
    }

    // Method untuk mendapatkan nomor reservasi
    public String getNomorReservasi() {
        return nomorReservasi;
    }

    public String getTanggalCheckIn() {
        return tanggalCheckIn.format(FORMATTER);
    }

    public String getTanggalCheckOut() {
        return tanggalCheckOut.format(FORMATTER);
    }

    public String getStatus() {
        return status;
    }

    // Method untuk menambahkan kamar ke dalam daftarKamar
    public void tambahKamar(int nomorKamar, String jenisKamar, double hargaPerMalam, String statusKamar) {
        Kamar kamar = new Kamar(nomorKamar, jenisKamar, hargaPerMalam, statusKamar);
        this.daftarKamar.add(kamar);
    }

    // Method untuk menampilkan semua kamar yang termasuk dalam reservasi
    public void tampilkanKamar() {
        for (Kamar kamar:daftarKamar) { // Mengiterasi setiap kamar di daftarKamar
            System.out.println("  "  + kamar.getInfo()); // Menampilkan informasi kamar menggunakan method getInfo() dari kelas Kamar
        }
    }
}