package Jobsheet04.Tugas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;  // Mengimpor kelas ArrayList untuk menyimpan daftar reservasi

public class Tamu {
    private String nama;
    private String noIdentitas;
    private String noTelepon;
    private String alamat;
    private ArrayList<Reservasi> daftarReservasi;

    // Membuat formatter untuk format tanggal dan waktu yang lebih mudah dibaca
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // Konstruktor untuk inisialisasi objek Tamu dengan informasi dasar
    public Tamu(String nama, String noIdentitas, String noTelepon, String alamat) {
        this.nama = nama;
        this.noIdentitas = noIdentitas;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
        this.daftarReservasi = new ArrayList<>(); // Menginisialisasi daftar reservasi sebagai ArrayList kosong
    }

    // Getter dan setter untuk atribut-atribut tamu
    public String getNama() {
        return nama;  // Mengembalikan nama tamu
    }

    public void setNama(String nama) {
        this.nama = nama; // Mengatur nama tamu
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
        Reservasi reservasi = new Reservasi(nomorReservasi, tanggalCheckIn, tanggalCheckOut, status); // Membuat objek Reservasi baru
        this.daftarReservasi.add(reservasi);
    }

    // Metode untuk menambah kamar ke dalam reservasi
    public void tambahKamarKeReservasi(int indexReservasi, int nomorKamar, String jenisKamar, double hargaPerMalam, String statusKamar) {
         // Mengecek apakah indeks reservasi valid
        if (indexReservasi >= 0 && indexReservasi < daftarReservasi.size()) {
            // Menambahkan kamar ke reservasi berdasarkan indeks reservasi
            daftarReservasi.get(indexReservasi).tambahKamar(nomorKamar, jenisKamar, hargaPerMalam, statusKamar);
        } else {
            System.out.println("Reservasi tidak ditemukan!"); // Menampilkan pesan error jika indeks reservasi tidak ditemukan
        }
    }

    // Getter untuk daftarReservasi
    public ArrayList<Reservasi> getDaftarReservasi() {
        return daftarReservasi; // Mengembalikan daftar reservasi yang dimiliki tamu
    }
    
    // Menampilkan seluruh reservasi beserta kamar
    public void tampilkanReservasi() {
        System.out.printf("Nomor Identitas\t : %s\n", noIdentitas);
        System.out.printf("Nama\t\t : %s\n", nama);
        System.out.printf("No. Telepon\t : %s\n", noTelepon); // Menambahkan nomor telepon
        System.out.printf("Alamat\t\t : %s\n", alamat);     // Menambahkan alamat
        
        // Mengecek apakah tamu memiliki reservasi
        if (daftarReservasi.isEmpty()) {
             // Menampilkan pesan jika tidak ada reservasi
            System.out.println("Belum ada riwayat reservasi");
        } else {
            // Menampilkan daftar reservasi yang dimiliki tamu
            System.out.println("Riwayat Reservasi : ");
            for (Reservasi reservasi : daftarReservasi) { // Mengiterasi daftar reservasi
                System.out.printf("  Nomor Reservasi  : %s\n", reservasi.getNomorReservasi()); 
                System.out.printf("  Tanggal CheckIn  : %s\n", reservasi.getTanggalCheckIn());
                System.out.printf("  Tanggal CheckOut : %s\n", reservasi.getTanggalCheckOut());
                System.out.printf("  Status           : %s\n", reservasi.getStatus());
                // Menampilkan daftar kamar yang termasuk dalam reservasi
                System.out.println("Daftar Kamar : ");
                reservasi.tampilkanKamar();
            }
        }
        System.out.println(); // Menambahkan baris kosong di akhir tampilan
    }    
}