/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3_Tugas;
import java.util.Scanner;
/**
 *
 * @author Fikri
 */
public class Tugas5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] menu = {"Soft Drink","Mix Juice","Nescafe","Soda Milk","Tea"};
        String nama;
        int c;
        System.out.println("   Cafe Ceria");
        System.out.println("  Aneka Minuman");
        System.out.println("-------------------------------");
        System.out.println(" SPESIAL MENU:");
        for (int i = 1; i <= menu.length; i++) {        
            System.out.println(i+". "+menu[i-1]);
        }
        System.out.print("Masukan Nama Pembeli : ");
        nama = scan.nextLine();
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        c = scan.nextInt();
        switch(c){
            case 1:
                System.out.println("Minuman Yang anda pesan adalah Soft Drink");
                break;
            case 2:
                System.out.println("Minuman Yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman Yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman Yang anda pesan adalah Soda Milk");
                break;
            case 5:
                System.out.println("Minuman Yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("salah");
                break;
        }
        System.out.println("Pesanan Anda Segera kami antar");
        System.out.println("Terimakaasih "+nama+" Telah Berkunjung di Cafe ceria");
        System.out.println("-------------------------------");
    }
    
}
