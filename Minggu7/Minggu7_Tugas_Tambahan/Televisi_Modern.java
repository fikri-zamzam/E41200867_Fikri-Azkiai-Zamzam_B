/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu7_Tugas_Tambahan;

/**
 *
 * @author Fikri
 */
public class Televisi_Modern extends Televisi {
    public static final int TV = 0;
    public static final int Teletext = 1;
    public int modustampilan = TV;
    public int jumlah_hal_Teletext = 150;
    private String cd;
    public Televisi_Modern(String des, int j_chn) {
        super(des, j_chn);
    }
    
    public void setModusTampilan(int modustampilan){
        switch(modustampilan){
            case TV :
                    System.out.println("Modus Tampilan : TV");
            break;
            case Teletext :
                    System.out.println("Modus Tampilan : Teletext");
            break;
        }
    }
    public void setDiskTray(String cd){
        this.cd = cd;
    }
    
    public void playCD(){
        if (modustampilan == TV) {
            if (cd == null) {
                System.out.println("Tidak ada cd didalam Disc Tray");
            } else {
                System.out.println("Sedang Memutar : "+cd);
            }
        } else {
            System.out.println("Ubah modus halaman terlebih dahulu");
        }
    }
    
    public void setHalamanTeletext(int hal){
        if (modustampilan == Teletext) {
            if (hal > jumlah_hal_Teletext || hal < 0) {
                System.out.println("Maaf Halaman yang anda tuju tidak ada");
            } else {
                System.out.println("Berbindah ke Halaman Teletext : "+hal);
            }
        } else {
            System.out.println("Ubah modus halaman terlebih dahulu");
        }
    }
}
