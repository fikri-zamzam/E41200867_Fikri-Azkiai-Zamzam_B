/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6_Tugas;
public class Selection_sort {
public static void selectionSort(int[] arr){  
    for (int i = 0; i < arr.length - 1; i++)  
    {  
        int index = i;  
        for (int j = i + 1; j < arr.length; j++){  
            if (arr[j] < arr[index]){  
                index = j;
            }  
        }  
        int terkecil = arr[index];  
        arr[index] = arr[i];
        arr[i] = terkecil;
    }  

}      

    public static void main(String[] args) {
        int[] num = {9,14,3,2,43,11,58,22};  
        System.out.println("Sebelum Diurutkan");  
        for(int i:num){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(num);//sorting array using selection sort  
         
        System.out.println("Setelah Diurutkan Secara Ascending");  
        for(int i:num){  
            System.out.print(i+" ");  
        }  
        System.out.println();
    }
    
}
