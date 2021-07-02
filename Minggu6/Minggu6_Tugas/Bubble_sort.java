/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6_Tugas;

public class Bubble_sort {
static void bubbleSort(int[] arr) {  
    int n = arr.length;  
    int temp = 0,g = 0;
    for(int i=0; i < n-1; i++){  
        for(int j=1; j < (n-i); j++){
            if(arr[j-1] > arr[j]){  
                temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;
            }
        }
    }
    for(int i : arr){
        System.out.print(i+" ");
    }
    System.out.println("");
}   

    public static void main(String[] args) {
       int [] d = {3,2,7,4,2,1};
        System.out.println("Data Sebelum diurutkan ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        System.out.println("Data setelah diurutkan");
        
       bubbleSort(d);
    }
    
}
