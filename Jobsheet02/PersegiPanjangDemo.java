package Jobsheet02;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
    
        PersegiPanjang pp = new PersegiPanjang(15, 10);

        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());

        pp.displayInfo();
    }
}