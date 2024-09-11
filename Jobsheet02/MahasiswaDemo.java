package Jobsheet02;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayunigtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

    //Instansiasi 2 objek mahasiswa baru 
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "034567";
        m2.nama = "Rina Susanti";
        m2.alamat = "Medan, Sumatera Utara";
        m2.kelas = "3B";

        m1.displayBiodata();
        System.out.println();
        m2.displayBiodata();
    }
}