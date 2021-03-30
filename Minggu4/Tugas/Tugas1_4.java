/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4_Tugas;
import java.util.Scanner;
/**
 *
 * @author Fikri
 */
public class Tugas1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int awal=0,akhir=0;
        
        System.out.print("Masukkan angka awal :");
        awal = scan.nextInt();
        System.out.print("Masukkan angka akhir :");
        akhir = scan.nextInt();
        
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
              System.out.println("angka ke-"+i);  
            }
            
        }
    }
    
}
