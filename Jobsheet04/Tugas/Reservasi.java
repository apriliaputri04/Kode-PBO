package Jobsheet04.Tugas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Reservasi {
    private String nomorReservasi;
    private LocalDateTime tanggalCheckIn;
    private LocalDateTime tanggalCheckOut;
    private String status;
    private ArrayList<Kamar> daftarKamar;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Reservasi(String nomorReservasi, LocalDateTime tanggalCheckIn, LocalDateTime tanggalCheckOut, String status) {
        this.nomorReservasi = nomorReservasi;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        this.status = status;
        this.daftarKamar = new ArrayList<>();
    }

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

    public void tambahKamar(int nomorKamar, String jenisKamar, double hargaPerMalam, String statusKamar) {
        Kamar kamar = new Kamar(nomorKamar, jenisKamar, hargaPerMalam, statusKamar);
        this.daftarKamar.add(kamar);
    }

    public void tampilkanKamar() {
        for (Kamar kamar:daftarKamar) {
            System.out.println("  "  + kamar.getInfo());
        }
    }
}