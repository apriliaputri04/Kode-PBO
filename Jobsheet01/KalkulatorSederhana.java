import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input angka1, operator, dan angka2
        System.out.print("Masukkan angka pertama : ");
        double angka1 = scanner.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Masukkan angka kedua : ");
        double angka2 = scanner.nextDouble();
        
        double hasil = 0;
        boolean valid = true;
        
        // Proses perhitungan berdasarkan operator
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                valid = false;
                break;
        }
        
        // Output hasil
        if (valid) {
            System.out.printf("Hasil: %.2f %c %.2f = %.2f\n", angka1, operator, angka2, hasil);
        }
        
        scanner.close();
    }
}