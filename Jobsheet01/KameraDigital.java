public class KameraDigital {
    public static void main(String[] args) {
        
        String merk1 = "Canon";
        String JenisLensa1 = "Lensa Zoom 17-50mm";
        int JumlahFoto1 = 10;

        String merk2 = "Sony";
        String JenisLensa2 = "Lensa Prime 55mm";
        int JumlahFoto2 = 5;

        String merk3 = "Nikon";
        String JenisLensa3 = "Lensa Makro 60mm";
        int JumlahFoto3 = 9;
        
        String merk4 = "Fujifilm";
        String JenisLensa4 = "Lensa Wide 10-18mm";
        int JumlahFoto4 = 7;

        String merk5 = "Olympus";
        String JenisLensa5 = "Lensa Telephoto 70-200mm";
        int JumlahFoto5 = 2;
        
        String merk6 = "Panasonic";
        String JenisLensa6 = "Lensa Pancake 40mm";
        int JumlahFoto6 = 11;

        String merk7 = "Pentax";
        String JenisLensa7 = "Lensa Fish-eye 8mm";
        int JumlahFoto7 = 8;

        String merk8 = "Leica";
        String JenisLensa8 = "Lensa Tilt-Shift 24mm";
        int JumlahFoto8 = 3;

        String merk9 = "Hasselblad";
        String JenisLensa9 = "Lensa Super Zoom 18-300mm";
        int JumlahFoto9 = 6;

        String merk10 = "Ricoh";
        String JenisLensa10 = "Lensa Standard 24-70mm";
        int JumlahFoto10 = 4;

        JumlahFoto1 = tambahFoto(JumlahFoto1, 10);
        JumlahFoto1 = kurangiFoto(JumlahFoto1, 5);

        JumlahFoto2 = tambahFoto(JumlahFoto2, 3);
        JumlahFoto2 = kurangiFoto(JumlahFoto2, 2);

        JumlahFoto3 = tambahFoto(JumlahFoto3, 4);
        JumlahFoto3 = kurangiFoto(JumlahFoto3, 1);

        JumlahFoto4 = tambahFoto(JumlahFoto4, 9);
        JumlahFoto4 = kurangiFoto(JumlahFoto4, 4);

        JumlahFoto5 = tambahFoto(JumlahFoto5, 11);
        JumlahFoto5 = kurangiFoto(JumlahFoto5, 5);

        JumlahFoto6 = tambahFoto(JumlahFoto6, 7);
        JumlahFoto6 = kurangiFoto(JumlahFoto6,3);

        JumlahFoto7 = tambahFoto(JumlahFoto7, 8);
        JumlahFoto7 = kurangiFoto(JumlahFoto7, 2);

        JumlahFoto8 = tambahFoto(JumlahFoto8, 5);
        JumlahFoto8 = kurangiFoto(JumlahFoto8, 6);

        JumlahFoto9 = tambahFoto(JumlahFoto9, 15);
        JumlahFoto9 = kurangiFoto(JumlahFoto9, 10);

        JumlahFoto10 = tambahFoto(JumlahFoto10, 12);
        JumlahFoto10 = kurangiFoto(JumlahFoto10, 9);

        CetakInfo(merk1, JenisLensa1, JumlahFoto1);
        CetakInfo(merk2, JenisLensa2, JumlahFoto2);
        CetakInfo(merk3, JenisLensa3, JumlahFoto3);
        CetakInfo(merk4, JenisLensa4, JumlahFoto4);
        CetakInfo(merk5, JenisLensa5, JumlahFoto5);
        CetakInfo(merk6, JenisLensa6, JumlahFoto6);
        CetakInfo(merk7, JenisLensa7, JumlahFoto7);
        CetakInfo(merk8, JenisLensa8, JumlahFoto8);
        CetakInfo(merk9, JenisLensa9, JumlahFoto9);
        CetakInfo(merk10, JenisLensa10, JumlahFoto10);

    }

    public static int tambahFoto(int JumlahFoto, int increment) {
        JumlahFoto += increment;
        return JumlahFoto;
    }

    public static int kurangiFoto(int JumlahFoto, int decrement) {
        JumlahFoto -= decrement;
        return JumlahFoto;
    }

    public static void CetakInfo(String merk, String JenisLensa, int JumlahFoto) {
        System.out.println("Merk Kamera : " +merk);
        System.out.println("Jenis Lensa : " +JenisLensa);
        System.out.println("Jumlah Foto : " + JumlahFoto);
        System.out.println("-----------------------------------");
    }
}