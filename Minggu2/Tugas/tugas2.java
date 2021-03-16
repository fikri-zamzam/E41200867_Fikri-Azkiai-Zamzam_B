/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2_tugas;

/**
 *
 * @author Fikri
 */
class ManagePerson {
    String Name;
    int Age;
    
    ManagePerson(String inName,int inAge){
        this.Name = inName;
        this.Age = inAge;
    }
    String getNama(){
       return this.Name;
    }
    int getUmur(){
        return this.Age;
    }   
}

public class tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManagePerson p1 = new ManagePerson("Aldi",13);
        ManagePerson p2 = new ManagePerson("Kelvin",16);
        
        if(p1.getUmur()==p2.getUmur()){
            System.out.println(p1.getNama() + " Is the same age as " + p2.getNama() );
        } else {
            System.out.println(p1.getNama()+" Is NOT the same age as "+ p2.getNama());
        }
      
    }
}
    

