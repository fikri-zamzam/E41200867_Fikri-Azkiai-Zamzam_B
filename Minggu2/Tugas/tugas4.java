/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2_tugas;

public class tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    String s1 = "ABC";
    String s2 = new String("DEF");
    String s3 ="AB"+ "C";
    
    
        System.out.println(s1.compareTo(s2));
    // output 1 
        System.out.println(s2.equals(s3));
    // output 2
        System.out.println(s3 == s1);
    // output 3
        System.out.println(s2.compareTo(s3));
    //output 4
        System.out.println(s3.equals(s1));
    //output 5
    
    }
    
}
