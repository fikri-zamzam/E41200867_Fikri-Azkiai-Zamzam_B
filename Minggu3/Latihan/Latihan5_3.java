/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3_Latihan;
import java.util.Scanner;
/**
 *
 * @author Fikri
 */
public class Latihan5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan nama warna :");
        lampu = scan.nextLine();
        
        switch(lampu) {
            case "Merah":
                System.out.println("Lampu Merah,Berhenti!");
                break;
            case "Kuning":
                System.out.println("Lampu Kuning,Berhati-hati");
                break;
            case "Hijau":
                System.out.println("Lampu Hijau,Silahkan Berjalan!");
                break;
            default:
                System.out.println("Maaf Warna yang anda masukkan salah");
        }
    }
    
}
