package Jobsheet07;

public class ManusiaDemo {
    public static void main(String[] args) {

        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();

        manusia1.bernafas(); 
        manusia1.makan(); 

        manusia2.bernafas(); 
        manusia2.makan(); 

        if (manusia1 instanceof Dosen) { 
            ((Dosen) manusia1).lembur();
        }

        if (manusia2 instanceof Mahasiswa) {
            ((Mahasiswa) manusia2).tidur(); 
        }
    }
}