package Quis2.Soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class KendaraanDemo {

    public static void tampilkanPergerakan(Kendaraan kendaraan) { // Polymorphic Arguments
        kendaraan.bergerak();  // Memanggil metode bergerak() yang ada di class Kendaraan
    }

    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>(); // Heterogeneous Collection
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Kendaraan ===");
        System.out.println("1. Tambah Mobil");
        System.out.println("2. Tambah Kapal");
        System.out.println("3. Lihat Semua Kendaraan");
        System.out.println("4. Update Kendaraan");
        System.out.println("0. Keluar");

        while (true) {
            System.out.print("\nPilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline setelah input angka

            if (pilihan == 1) {
                System.out.print("Masukkan merk mobil: ");
                String merkMobil = scanner.nextLine();
                System.out.print("Masukkan kapasitas penumpang: ");
                int kapasitas = scanner.nextInt();
                System.out.print("Masukkan kecepatan maksimum (km/jam): ");
                int kecepatan = scanner.nextInt();
                // Pastikan objek Mobil dibuat dengan benar dan dimasukkan ke dalam daftar
                Mobil mobil = new Mobil(merkMobil, kapasitas, kecepatan);
                daftarKendaraan.add(mobil);
                System.out.println("Mobil berhasil ditambahkan!");

            } else if (pilihan == 2) {
                System.out.print("Masukkan merk kapal: ");
                String merkKapal = scanner.nextLine();
                System.out.print("Masukkan kapasitas penumpang: ");
                int kapasitas = scanner.nextInt();
                System.out.print("Masukkan bobot kapal (ton): ");
                double bobot = scanner.nextDouble();
                // Pastikan objek Kapal dibuat dengan benar dan dimasukkan ke dalam daftar
                Kapal kapal = new Kapal(merkKapal, kapasitas, bobot);
                daftarKendaraan.add(kapal);
                System.out.println("Kapal berhasil ditambahkan!");

            } else if (pilihan == 3) {
                if (daftarKendaraan.isEmpty()) {
                    System.out.println("Belum ada kendaraan yang ditambahkan.");
                } else {
                    System.out.println("\n=== Daftar Kendaraan ===");
                    // Hanya menampilkan kendaraan yang valid (tidak null)
                    for (Kendaraan kendaraan : daftarKendaraan) {
                        if (kendaraan != null) { // Pastikan kendaraan tidak null
                            System.out.println("- " + kendaraan.getmerk());
                            tampilkanPergerakan(kendaraan); // Menampilkan pergerakan

                            if (kendaraan instanceof Mobil) { // instanceof Operator
                                Mobil mobil = (Mobil) kendaraan; // Object Casting
                                System.out.println("Kapasitas penumpang: " + mobil.getKapasitasPenumpang() + " orang");
                                // Hapus pemanggilan bergerak() di sini, karena sudah dipanggil di tampilkanPergerakan
                                System.out.println("Kecepatan Maksimum: " + mobil.getKecepatanMaks() + " km/jam");
                                mobil.isiBensin();
                            } else if (kendaraan instanceof Kapal) { // instanceof Operator
                                Kapal kapal = (Kapal) kendaraan; // Object Casting
                                System.out.println("Kapasitas penumpang: " + kapal.getKapasitasPenumpang() + " orang");
                                // Hapus pemanggilan bergerak() di sini, karena sudah dipanggil di tampilkanPergerakan
                                System.out.println("Bobot: " + kapal.getBobotKapal() + " ton");
                                kapal.tambatDiPelabuhan();
                            }
                            System.out.println();
                        }
                    }
                }

            } else if (pilihan == 4) {
                if (daftarKendaraan.isEmpty()) {
                    System.out.println("Belum ada kendaraan untuk diupdate.");
                } else {
                    System.out.println("\nPilih kendaraan untuk diupdate:");
                    // Pastikan hanya kendaraan yang valid yang ditampilkan
                    for (int i = 0; i < daftarKendaraan.size(); i++) {
                        Kendaraan kendaraan = daftarKendaraan.get(i);
                        if (kendaraan != null) { // Pastikan kendaraan tidak null
                            System.out.println((i + 1) + ". " + kendaraan.getmerk());
                        }
                    }

                    System.out.print("Masukkan nomor kendaraan: ");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine(); // Membersihkan newline

                    // Validasi input dan pastikan kendaraan yang dipilih ada
                    if (index >= 0 && index < daftarKendaraan.size() && daftarKendaraan.get(index) != null) {
                        Kendaraan kendaraan = daftarKendaraan.get(index);

                        if (kendaraan instanceof Mobil) { // instanceof Operator
                            Mobil mobil = (Mobil) kendaraan; // Object Casting
                            System.out.print("Masukkan kecepatan maksimum baru (km/jam): ");
                            int kecepatanBaru = scanner.nextInt();
                            mobil.setKecepatanMaks(kecepatanBaru);
                            System.out.println("Kecepatan maksimum berhasil diupdate!");
                            tampilkanPergerakan(kendaraan); // Memanggil bergerak() di sini, setelah update

                        } else if (kendaraan instanceof Kapal) { // instanceof Operator
                            Kapal kapal = (Kapal) kendaraan; // Object Casting
                            System.out.print("Masukkan bobot kapal baru (ton): ");
                            double bobotBaru = scanner.nextDouble();
                            kapal.setBobotKapal(bobotBaru);
                            System.out.println("Bobot kapal berhasil diupdate!");
                            tampilkanPergerakan(kendaraan); // Memanggil bergerak() di sini, setelah update
                        }
                    } else {
                        System.out.println("Nomor kendaraan tidak valid.");
                    }
                }

            } else if (pilihan == 0) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }
}