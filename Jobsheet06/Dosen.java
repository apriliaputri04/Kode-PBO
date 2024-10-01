package Jobsheet06;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getAllInfo() {
        String info = this.getInfo();
        info += "NIDN   : " + this.nidn + "\n";
        
        return info;
    
    }
}