/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2_latihan;
class book {
    int price;
    int page;
    
    public void set(int inPrice,int inPage){
        this.price = inPrice;
        this.page = inPage;
    }
    
    public void show(){
        System.out.println("Book Information");
        System.out.println("Book price : "+price);
        System.out.println("Number of Pages :"+page);
    }
}
/**
 *
 * @author Fikri
 */
public class Latihan3 {


    public static void main(String[] args) {
        book javabook = new book();
        javabook.set(60000, 16);
        javabook.show();
    }
    
}
