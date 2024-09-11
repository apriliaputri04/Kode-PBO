package Jobsheet03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    // Constructor
    public Anggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0; // Default, belum ada pinjaman
    }

    // Getter dan Setter
    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public void setLimitPeminjaman(int limitPeminjaman) {
        this.limitPeminjaman = limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam uang
    public void pinjam(int nominal) {
        if (nominal > 0 && jumlahPinjaman + nominal <= limitPeminjaman) {
            jumlahPinjaman += nominal;
            System.out.println("Jumlah pinjaman saat ini : " + jumlahPinjaman);
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    // Method untuk mengangsur pinjaman
    public void angsur(int nominal) {
        if (nominal > 0) {
            double minimalAngsuran = 0.1 * jumlahPinjaman; // 10% dari jumlah pinjaman saat ini
            if (nominal >= minimalAngsuran) {
                jumlahPinjaman -= nominal;
                if (jumlahPinjaman < 0) {
                    jumlahPinjaman = 0;
                }
                System.out.println("Jumlah pinjaman saat ini : " + jumlahPinjaman);
            } else {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
            }
        } else {
            System.out.println("Nominal angsuran tidak valid.");
        }
    }
}