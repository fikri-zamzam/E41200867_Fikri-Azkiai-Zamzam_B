/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6_Tugas;

public class Bubble_sort_dec {

    public static void b_sort(int[] arr){
        int Temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] < arr[j]) {
                    Temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = Temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        System.out.println(" ( Bubble Sort ) ");
        int [] num = {2,23,2,5,22,46,9};
        System.out.println("Data Sebelum Diurutkan :");
        for(int i : num){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Data Setelah Diurutkan "
                + "Secara Descending :");
        b_sort(num);
    }
    
}
