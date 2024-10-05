package Jobsheet07;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    @Override
    public double getGaji() {
        return super.getGaji();
    }

    public void lihatInfo() {
        System.out.printf("NIP           : %s\n", this.getNip());
        System.out.printf("Nama          : %s\n", this.getNama());
        System.out.printf("Golongan      : %s\n", this.getGolongan());
        System.out.printf("Jumlah Lembur : %d\n", this.getLembur());
        System.out.printf("Gaji Lembur   : Rp %.0f\n", this.getGajiLembur());
        System.out.printf("Total Gaji    : Rp %.0f\n", this.getGaji(lembur, gajiLembur));
        System.out.println();
    }
}