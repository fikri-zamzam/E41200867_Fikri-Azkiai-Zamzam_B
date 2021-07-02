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
public class user2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisi_Modern tv2 = new Televisi_Modern("TV SAMSUNG",10);
        
       String [] chn = {"Rcti","indosiar","Space toon","ANTV","GTV","NAT GEO"
       ,"History","CN","Nick","FOX Movie","Trans 7","Trans tv"};
       String [] chn2 = {"Rcti","indosiar","Space toon","ANTV","GTV","NAT GEO"};
       
       System.out.println("Pak Zamzam Membeli TV : "+tv2.GetDeskripsi());
       
       tv2.setChannel(chn);
       tv2.setChannel(chn2);
       tv2.setChannelaktif(4);
       tv2.setVolume(7);
       tv2.setChannelaktif(10);
       tv2.setChannelaktif(6);
       tv2.setModusTampilan(Televisi_Modern.Teletext);
       tv2.setHalamanTeletext(134);
       tv2.setModusTampilan(Televisi_Modern.TV);
       tv2.playCD();
       tv2.setDiskTray("1917");
       tv2.playCD();
       
    }
    
}
