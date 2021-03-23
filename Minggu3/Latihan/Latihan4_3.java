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
public class Latihan4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai = 0;
        System.out.print("Masukan nilai : ");
        nilai = scan.nextInt();
        String Grade = "";
        if (nilai >= 90) {
            Grade = "A";
        } 
        else if(nilai >= 80){
            Grade = "B+";
        }
        else if(nilai >= 70){
            Grade = "B";
        }
        else if(nilai >= 60){
            Grade = "C+";
        }
        else if(nilai >= 50){
            Grade = "C";
        }
        else if(nilai >= 40){
            Grade = "D";
        } else {
            Grade = "E";
        }
        
        System.out.println("Grade : "+Grade);
    }
    
}
