package UTS.Soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi objek customer dan kendaraan
        String[] customerDocs = {"buy.pdf"};
        UserProfile customerProfile = new UserProfile(1234, "customer", "Aprilia Putri Anggraeni", 19, "apriliaputri8057@gmail.com", customerDocs);
        Customer customer1 = new Customer(customerProfile, "Admin kurang responsif dalam menangani verifikasi dokumen pembeli");

        // Deklarasi admin
        String[] adminDocs = {"admin_license.pdf"};
        UserProfile adminProfile = new UserProfile(12, "admin", "Admin 1", 35, "admin1@example.com", adminDocs);
        Admin admin1 = new Admin(adminProfile);

        // Deklarasi objek kendaraan (Mobil)
        Kendaraan mobil = new Kendaraan(1, "Honda", "HR-V", "Pertalite", 2022);
        admin1.addKendaraan(mobil);

        // Simulasi login untuk admin dan customer
        boolean loginMenu = true;
        while (loginMenu) {
            System.out.println("\n--- Menu Login ---");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih Opsi: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Konsumsi newline

            switch (choice) {
                case 1: // Login Admin
                    System.out.println("\n--- Login Admin ---");
                    System.out.print("Masukkan User ID: ");
                    int adminUserId = sc.nextInt();
                    sc.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan Password: ");
                    String adminPassword = sc.nextLine();

                    if (admin1.login(adminUserId, adminPassword)) {
                        boolean adminMenu = true;
                        while (adminMenu) {
                            System.out.println("\n--- Menu Admin ---");
                            System.out.println("1. Update Detail Kendaraan");
                            System.out.println("2. Tambah Kendaraan");
                            System.out.println("3. Tampilkan Kendaraan");
                            System.out.println("4. Ambil Keluhan dari Customer");
                            System.out.println("5. Verifikasi Customer");
                            System.out.println("6. Logout");
                            System.out.print("Pilih Opsi: ");
                            int adminChoice = sc.nextInt();
                            sc.nextLine(); // Konsumsi newline

                            switch (adminChoice) {
                                case 1: // Update Detail Kendaraan
                                    System.out.print("Masukkan ID kendaraan yang ingin diupdate: ");
                                    int updateId = sc.nextInt();
                                    sc.nextLine(); // Konsumsi newline
                                    System.out.print("Update Merk: ");
                                    String newMerek = sc.nextLine();
                                    System.out.print("Update Jenis: ");
                                    String newJenis = sc.nextLine();
                                    System.out.print("Update Bahan Bakar: ");
                                    String newBahanBakar = sc.nextLine();
                                    System.out.print("Update Tahun: ");
                                    int newTahun = sc.nextInt();
                                    admin1.updateKendaraan(updateId, newMerek, newJenis, newBahanBakar, newTahun);
                                    break;

                                case 2: // Tambah Kendaraan
                                    System.out.print("Masukkan ID kendaraan: ");
                                    int id = sc.nextInt();
                                    sc.nextLine(); // Konsumsi newline
                                    System.out.print("Masukkan Merek: ");
                                    String merk = sc.nextLine();
                                    System.out.print("Masukkan Jenis: ");
                                    String jenis = sc.nextLine();
                                    System.out.print("Masukkan Bahan Bakar: ");
                                    String bahanBakar = sc.nextLine();
                                    System.out.print("Masukkan Tahun: ");
                                    int tahun = sc.nextInt();
                                    Kendaraan kendaraanBaru = new Kendaraan(id, jenis, merk, bahanBakar, tahun);
                                    admin1.addKendaraan(kendaraanBaru);
                                    break;

                                case 3: // Tampilkan Kendaraan
                                    admin1.displayKendaraan();
                                    break;

                                case 4: // Ambil Keluhan dari Customer
                                    System.out.println("Keluhan: " + customer1.getComplaint());
                                    break;

                                case 5: // Verifikasi Customer
                                    admin1.verifyUser(customer1);
                                    System.out.println("Status Verifikasi: " + customer1.getVerificationStatus());
                                    break;

                                case 0: // Logout
                                    adminMenu = false;
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid.");
                            }
                        }
                    } else {
                        System.out.println("Login gagal. ID atau Password salah.");
                    }
                    break;

                case 2: // Login Customer
                    System.out.println("\n--- Login Customer ---");
                    System.out.print("Masukkan User ID: ");
                    int customerUserId = sc.nextInt();
                    sc.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan Password: ");
                    String customerPassword = sc.nextLine();

                    if (customer1.login(customerUserId, customerPassword)) {
                        boolean customerMenu = true;
                        while (customerMenu) {
                            System.out.println("\n--- Menu Customer ---");
                            System.out.println("1. Update Profile");
                            System.out.println("2. Verifikasi Dokumen");
                            System.out.println("3. Cek Status Verifikasi");
                            System.out.println("0. Logout");
                            System.out.print("Pilih Opsi: ");
                            int customerChoice = sc.nextInt();
                            sc.nextLine(); // Konsumsi newline

                            switch (customerChoice) {
                                case 1: // Update Profile
                                    System.out.print("Nama Baru: ");
                                    String newName = sc.nextLine();
                                    System.out.print("Umur Baru: ");
                                    int newAge = sc.nextInt();
                                    sc.nextLine(); // Konsumsi newline
                                    System.out.print("Email Baru: ");
                                    String newEmail = sc.nextLine();
                                    customer1.updateProfile(newName, newAge, newEmail);
                                    System.out.println("Profile berhasil diperbarui:");
                                    System.out.println(customer1.getUserProfile().displayInfo());
                                    break;

                                case 2: // Verifikasi Dokumen
                                    System.out.print("Masukkan dokumen untuk verifikasi: ");
                                    String doc = sc.nextLine();
                                    customer1.applyVerification(doc);
                                    break;

                                case 3: // Cek Status Verifikasi
                                    System.out.println("Status Verifikasi Anda: " + customer1.getVerificationStatus());
                                    break;

                                case 0: // Logout
                                    customerMenu = false;
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid.");
                            }
                        }
                    } else {
                        System.out.println("Login gagal. ID atau Password salah.");
                    }
                    break;

                case 3: // Keluar
                    loginMenu = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        sc.close();
    }
}
