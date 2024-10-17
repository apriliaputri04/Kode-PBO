package UTS.Soal3;

public class Customer {
    public UserProfile profile;
    public String complaint;
    private boolean isVerified; // Tambahkan status verifikasi

    public Customer(UserProfile profile, String complaint) {
        this.profile = profile;
        this.complaint = complaint;
        this.isVerified = false; // Status default belum diverifikasi
    }

    public boolean login(int userId, String password) {
        return this.profile.getUserId() == userId && this.profile.getPassword().equals(password);
    }

    public UserProfile getUserProfile() {
        return this.profile;
    }

    public String getComplaint() {
        return this.complaint;
    }

    public boolean isVerified() { // Method untuk mendapatkan status verifikasi
        return isVerified;
    }

    public void updateProfile(String newName, int newAge, String newEmail) {
        if (newName != null) {
            this.profile.setName(newName);
        }
        if (newAge > 0) {
            this.profile.setAge(newAge);
        }
        if (newEmail != null) {
            this.profile.setEmail(newEmail);
        }
    }

    public void applyVerification(String document) {
        System.out.println("Dokumen untuk verifikasi telah diajukan: " + document);
    }

    public void verify() { // Menambahkan method untuk mengubah status verifikasi
        this.isVerified = true;
        System.out.println("Customer " + profile.getName() + " telah diverifikasi.");
    }

    public String getVerificationStatus() {
        return isVerified ? "Diverifikasi" : "Belum diverifikasi";
    }

    public void recoverPassword(String newPassword) {
        this.profile.setPassword(newPassword);
        System.out.println("Password berhasil diperbarui.");
    }
}
