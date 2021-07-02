/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6_Tugas;

public class Selection_sort_dec {
public static void selectionSortDec(int[] arr){  
    for (int i = 0; i < arr.length - 1; i++)  
    {
        int index = i;
        for (int j = i + 1; j < arr.length; j++){  
            if (arr[j] > arr[index]){  
                index = j;
            }
        }
        int terbesar = arr[index];  
        arr[index] = arr[i];
        arr[i] = terbesar;
    }
    
    for(int i :  arr){
        System.out.print(i+" ");
    }
    System.out.println();

}
    public static void main(String[] args) {
        System.out.println(" ( Selection Sort ) ");
        int [] ank = {5,16,23,21,19,7,1};
        System.out.println("Data Sebelum Diurutkan :");
        for(int i :  ank){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Data Setelah Diurutkan "
                + "Secara Descending :");
        selectionSortDec(ank);
        
    }
    
}
