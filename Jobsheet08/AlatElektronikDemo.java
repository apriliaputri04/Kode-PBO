package Jobsheet08;

public class AlatElektronikDemo {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Angin", 170000, "Jingga", "Sekai");
        TV tv = new TV("LED", 10, 2000000, "Hitam", "Polytron");
        Kulkas kulkas = new Kulkas(2, 2500000, "Biru", "Samsung");
        SmartFridge smartFridge = new SmartFridge(10, 3, 4600000, "Putih", "LG");

        System.out.println(kipas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
    }
}
