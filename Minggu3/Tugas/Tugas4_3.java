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
public class Tugas4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        int b,jml = 0;
        boolean stat = true;
        System.out.println("----------------------------------------");
        System.out.println("     Kharisma Agung Plaza ( KAP )");
        System.out.println("     Promo belanja berhadiah");
        System.out.println("     Khusus pembelian 5 barang pertama");
        System.out.println("     Dengan Harga minimum 10,000");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = scan.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-"+i   +":");
            b = scan.nextInt();
            jml +=b;
            if(b <= 10000){
                stat = false;
            }
        }
        System.out.println("Total belanja atas nama "+nama+" adalah :Rp."+jml);
        System.out.println("");
        if (stat) {
            System.out.println("Selamat");
            System.out.println("Anda telah mendapatkan mug cantik");
        }
        System.out.println("----------------------------------------");
        System.out.println("               Terimakasih");
        System.out.println("Anda telah belanja di Kharisma Agung plaza");
    }
    
}
