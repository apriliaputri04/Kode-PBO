package Jobsheet06;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super();
        super.nip = nip;
        super.nama = nama;
        super.gaji = gaji;
        this.nidn = nidn;

        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        
        return info;
    
    }
}