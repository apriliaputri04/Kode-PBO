package Jobsheet07;

public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewStaff() {
        for (int i = 0; i < st.length; i++) {
            if (st[i] != null) {  // Cek apakah elemen array staff tidak null
                st[i].lihatInfo();
            }
        }
    }

    public void lihatInfo() {
        System.out.printf("NIP           : %s\n", this.getNip());
        System.out.printf("Nama          : %s\n", this.getNama());
        System.out.printf("Golongan      : %s\n", this.getGolongan());
        System.out.printf("Tunjangan     : Rp %.0f\n", this.getTunjangan());
        System.out.printf("Total Gaji    : Rp %.0f\n", this.getGaji());
        System.out.printf("Bagian        : %s\n", this.getBagian());
        System.out.println("-----------------------------");
        this.viewStaff();
        System.out.println();
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}