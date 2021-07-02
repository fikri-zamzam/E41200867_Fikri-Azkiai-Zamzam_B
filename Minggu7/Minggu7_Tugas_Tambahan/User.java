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
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Televisi tv = new Televisi("TV TABUNG TOSHIBA 12 Inch",10);
       String [] chn = {"Rcti","indosiar","Space toon","ANTV","GTV","NAT GEO"
       ,"History","CN","Nick","FOX Movie","Trans 7","Trans tv"};
       
       String [] chn2 = {"Rcti","indosiar","Space toon","ANTV","GTV","NAT GEO"};
       
       System.out.println("Pak Zamzam Membeli TV : "+tv.GetDeskripsi());
       
       tv.setChannel(chn);
       tv.setChannel(chn2);
       tv.setChannelaktif(4);
       tv.setVolume(7);
       tv.setChannelaktif(10);
       tv.setChannelaktif(6);
    }
    
}
