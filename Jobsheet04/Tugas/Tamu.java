package Jobsheet04.Tugas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Tamu {
    private String nama;
    private String noIdentitas;
    private String noTelepon;
    private String alamat;
    private ArrayList<Reservasi> daftarReservasi;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Tamu(String nama, String noIdentitas, String noTelepon, String alamat) {
        this.nama = nama;
        this.noIdentitas = noIdentitas;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
        this.daftarReservasi = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Metode untuk menambah reservasi
    public void tambahReservasi(String nomorReservasi, LocalDateTime tanggalCheckIn, LocalDateTime tanggalCheckOut, String status) {
        Reservasi reservasi = new Reservasi(nomorReservasi, tanggalCheckIn, tanggalCheckOut, status);
        this.daftarReservasi.add(reservasi);
    }

    // Metode untuk menambah kamar ke dalam reservasi
    public void tambahKamarKeReservasi(int indexReservasi, int nomorKamar, String jenisKamar, double hargaPerMalam, String statusKamar) {
        if (indexReservasi >= 0 && indexReservasi < daftarReservasi.size()) {
            daftarReservasi.get(indexReservasi).tambahKamar(nomorKamar, jenisKamar, hargaPerMalam, statusKamar);
        } else {
            System.out.println("Reservasi tidak ditemukan!");
        }
    }

    // Getter untuk daftarReservasi
    public ArrayList<Reservasi> getDaftarReservasi() {
        return daftarReservasi;
    }

    // Menampilkan seluruh reservasi beserta kamar
    public void tampilkanReservasi() {
        System.out.printf("Nomor Identitas\t : %s\n", noIdentitas);
        System.out.printf("Nama\t\t : %s\n", nama);
        System.out.printf("No. Telepon\t : %s\n", noTelepon); // Menambahkan nomor telepon
        System.out.printf("Alamat\t\t : %s\n", alamat);     // Menambahkan alamat
        
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada riwayat reservasi");
        } else {
            System.out.println("Riwayat Reservasi : ");
            for (Reservasi reservasi : daftarReservasi) {
                System.out.printf("  Nomor Reservasi  : %s\n", reservasi.getNomorReservasi()); 
                System.out.printf("  Tanggal CheckIn  : %s\n", reservasi.getTanggalCheckIn());
                System.out.printf("  Tanggal CheckOut : %s\n", reservasi.getTanggalCheckOut());
                System.out.printf("  Status           : %s\n", reservasi.getStatus());
                System.out.println("Daftar Kamar : ");
                reservasi.tampilkanKamar();
            }
        }
        System.out.println();
    }    
}