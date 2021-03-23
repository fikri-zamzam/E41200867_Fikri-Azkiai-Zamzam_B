/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3_Tugas;

/**
 *
 * @author Fikri
 */
public class Tugas3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] a = {{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        
    }
    
}
