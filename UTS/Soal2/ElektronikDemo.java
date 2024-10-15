package UTS.Soal2;

public class ElektronikDemo {
    public static void main(String[] args) {
        // Membuat objek KipasAngin
        KipasAngin kipas = new KipasAngin("Panasonic", "Putih", "Sedang", 50.0, 2, "Stand Fan");
        
        // Menampilkan informasi kipas angin biasa
        System.out.println("Informasi Kipas Angin :");
        System.out.println("-----------------------");
        System.out.println(kipas.getInfo());
        System.out.println(); // Tambahkan baris kosong untuk pemisah

        // Membuat objek KipasAnginUSB
        KipasAnginUSB kipasUSB = new KipasAnginUSB("Maspion", "Biru", "Kecil", 5.0, 
                                                      3, "Meja", "USB-C", 
                                                      "Lampu LED", true);

        // Menampilkan informasi kipas angin USB
        System.out.println("Informasi Kipas Angin USB :");
        System.out.println("---------------------------");
        System.out.println(kipasUSB.getInfo());
    }
}
