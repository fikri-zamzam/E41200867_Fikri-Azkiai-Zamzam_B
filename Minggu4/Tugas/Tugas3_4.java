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
public class Tugas3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int ank = 0,d=0,b=0;

        
        System.out.print("Masukkan Jumlah data :");
        ank = scan.nextInt();
        int [] list = new int[ank];
        int min=list[0],max=list[0],avg=0;

        
        for (int i = 0; i < ank; i++) {
            d = i+1;
            System.out.print("Masukkan Nilai ke-"+d+" :");
            b = scan.nextInt();
            list[i] = b;
        }
        for (int i = 0; i < ank; i++) {
            avg += list[i];
            if (list[i] < max) {
                min = list[i];
            } else {
                max = list[i];
            }
        }
        System.out.println("Nilai Minimumnya Adalah :"+min);
        System.out.println("Nilai Maximumnya Adalah :"+max);
        avg = avg/list.length;
        System.out.println("Nilai Rata-Ratanya Adalah :"+avg);
    }
    
}
