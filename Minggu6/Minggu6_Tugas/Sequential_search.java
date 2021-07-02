/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6_Tugas;

public class Sequential_search {
    public static void search(String [] idx,String trgt){
        boolean temu = false;
        for (int i = 0; i < idx.length; i++) {
            if(idx[i].equals(trgt)){
                System.out.println(trgt + " ada di index " + i);
                temu = true;
            }
        }
        if(!temu){
            System.out.println("Data yang anda cari tidak ada");
        }
    }
    public static void main(String[] args) {
        String nama [] = {"zamzam","lukman","albert","ricard","juan"};
        search(nama,"juan");
    }
    
}
