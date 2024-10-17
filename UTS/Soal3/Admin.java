package UTS.Soal3;

import java.util.ArrayList;

public class Admin {
    public UserProfile profile;
    public ArrayList<Kendaraan> kendaraanList;

    public Admin(UserProfile profile) {
        this.profile = profile;
        this.kendaraanList = new ArrayList<>();
    }

    public boolean login(int userId, String password) {
        return this.profile.getUserId() == userId && this.profile.getPassword().equals(password);
    }

    public void addKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void displayKendaraan() {
        if (kendaraanList.isEmpty()) {
            System.out.println("Tidak ada kendaraan yang terdaftar.");
            return;
        }
        System.out.println("--- Daftar Kendaraan ---");
        for (Kendaraan k : kendaraanList) {
            System.out.println(k.displayInfo());
        }
    }

    public void verifyUser(Customer customer) {
        // Melakukan verifikasi customer
        customer.verify(); // Memanggil metode verify() pada customer
    }

    public void handleVerificationResponse(Customer customer, boolean isVerified) {
        if (isVerified) {
            System.out.println("Customer " + customer.getUserProfile().getName() + " telah diverifikasi.");
        } else {
            System.out.println("Customer " + customer.getUserProfile().getName() + " tidak diverifikasi.");
        }
    }

    public void updateKendaraan(int id, String newMerek, String newJenis, String newBahanBakar, int newTahun) {
        for (Kendaraan k : kendaraanList) {
            if (k.getId() == id) {
                k.setMerek(newMerek);
                k.setJenis(newJenis);
                k.setBahanBakar(newBahanBakar);
                k.setTahun(newTahun);
                System.out.println("Kendaraan dengan ID " + id + " telah diperbarui:");
                System.out.println(k.displayInfo()); // Menampilkan info kendaraan yang sudah diperbarui
                return;
            }
        }
        System.out.println("Kendaraan dengan ID " + id + " tidak ditemukan.");
    }
}
