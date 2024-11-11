package Jobsheet10;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        
        // Membuat objek dosen
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom., M.Kom.", "199402");
        Dosen dosen2 = new Dosen("19780165", "Muhammad, S.T., M.T.", "197801");

        // Membuat objek tenaga kependidikan
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // Menampilkan informasi dosen
        System.out.println("Data Dosen :");
        dosen1.displayInfo();
        System.out.println();
        dosen2.displayInfo();
        System.out.println();

        // Menampilkan informasi tenaga kependidikan
        System.out.println("Data Tenaga Kependidikan :");
        tendik1.displayInfo();
        System.out.println();
        tendik2.displayInfo();
    }
}