/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3_Tugas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class Tugas2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random rndm = new Random(); 
         Scanner scan = new Scanner(System.in);
         
         int jml = 0;
         
         System.out.print("Masukkan jumlah array :");
         jml = scan.nextInt();
         
         int [] angka = new int[jml];
         
         for (int i = 0; i < angka.length; i++) {
            angka[i] = rndm.nextInt(8);
        }
        
         for (int j = 0; j < angka.length; j++) {
             System.out.print(angka[j] + " ");
        }
         System.out.println("");
    }
    
}
