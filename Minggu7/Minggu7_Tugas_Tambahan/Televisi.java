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
public class Televisi {
    private String Deskripsi;
    private int jumlahChannel;
    public String [] Channels = null;
    public int Channel_Aktif;
    public int Volume;
    
    Televisi(String des, int j_chn){
        this.Deskripsi = des;
        this.jumlahChannel = j_chn;
    }
    
    public String GetDeskripsi(){
        return this.Deskripsi;
    }
    
    public void setChannel(String [] a){
        String sep = System.lineSeparator();
        if (a.length > this.jumlahChannel) {
            System.out.println("Maaf Tv hanya dapat Menampung "
                    + this.jumlahChannel + " Channel saja");
        } else {
                this.Channels = a;
                System.out.println("Selamat Daftar Channel "
                        + "berhasil di update !"+sep);
        }
    }
    
    public void setVolume(int vol){
        this.Volume = vol;
        System.out.println("Intensitas Volume Sekarang : "+
                this.Volume);
    }
    
    public void setChannelaktif(int chn_aktif){
        // chn_aktif = 8
        this.Channel_Aktif = chn_aktif;
        if (chn_aktif >= this.jumlahChannel || chn_aktif <= 0) {
            System.out.println("Maaf Channel yang anda cari belum di set");
        } else {
            System.out.println("Pindah Channel ke : "+
                    this.Channels[chn_aktif-1]);
        }
    }
    
    public void getChannel(){
        for (int i = 0; i < this.Channels.length; i++) {
            if (this.Channels[i] == null) {
                System.out.println(this.jumlahChannel-i+
                        " Channel Belum ditambahkan");
                break;
            } else {
                System.out.println(this.Channels[i]);
            }
        }
    }
    
}
