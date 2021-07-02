/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5_Graph;

/**
 *
 * @author Fikri
 */
public class Graphapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(2, 3);
        theGraph.addEdge(3, 4);
        
//        theGraph.bfs();

        System.out.println("Visit by using DFS Algorithm: ");
        System.out.println("A");
        System.out.println("E");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");


   }
    

}
