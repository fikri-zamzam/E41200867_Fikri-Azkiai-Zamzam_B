/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3_Latihan;

/**
 *
 * @author Fikri
 */
public class Latihan3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] angka3 = {{5,3,1,2,3},{4,6,7,3,2},{4,3,2,5,6}};
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print(angka3[baris][kolom]+"   ");
            }
            System.out.println("");
        }
    }
    
}
