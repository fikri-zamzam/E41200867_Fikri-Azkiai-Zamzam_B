/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu7_Tugas_WD;

import java.awt.*;
import java.applet.*;

public class Tugas1 extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init(){
        font = new Font("Arial",Font.ITALIC,18);
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        blueColor = new Color(0,0,112);
        setBackground(backgroundColor);
    }
    
    public void stop(){
        
    }
    
    public void paint(Graphics graph){
        //set font
        graph.setFont(font);
        //create tittle
        graph.drawString("Draw Shape", 90, 20);
        
        //set the color for the first shape
        graph.setColor(blueColor);
        //draw a rectangle
        graph.drawRect(120, 120, 120, 120);
        //fill the rectangel
        graph.fillRect(115, 115, 90, 90);
        
        //set the color for the next shape
        graph.setColor(redColor);
        //draw a circle 
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
        //set the color for next shape
        graph.setColor(Color.CYAN);
        //draw another rectangel
        graph.drawRect(50, 50, 50, 50);
        //this will fill rectangel
        graph.fillRect(50, 50, 50, 50);
        
    }
    
    
    public static void main(String[] args, Graphics graph) {
        Tugas1 a = new Tugas1();
        a.paint(graph);
    }
    
}
