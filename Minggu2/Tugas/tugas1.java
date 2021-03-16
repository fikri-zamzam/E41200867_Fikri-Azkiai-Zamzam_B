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
class Person {
    String stuName;
    String stuAge;
    String stuID;
    String stuStatus;
    
    Person(String name,String age){
        this.stuName = name;
        this.stuAge = age;
    }
    
    void getName(){
        System.out.println("Nama : "+this.stuName);
    }
    
    void getAge() {
        System.out.println("Umur : "+this.stuAge);
    }
    
    void setAge(String age){
        this.stuAge = age;
    }
}
public class tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Fikri zamzam","12");
        
        p1.getName();
        p1.setAge("17");
        p1.getAge();
        
    }
    
}
