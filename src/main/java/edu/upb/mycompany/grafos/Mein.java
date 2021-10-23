/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.mycompany.grafos;

/**
 *
 * @author johan
 */
public class Mein {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Grafo miGrafo = new Grafo(true,false);
        
        miGrafo.addVertex("Bogota");
        miGrafo.addVertex("Bucaramanga");
        miGrafo.addVertex("Medellin");
        
        Vertex bog = getVertexByValue("Bogotá");
        Vertex buc = getVertexByValue("Bucaramanga");
        Vertex med = getVertexByValue("Medellín");
        
        miGafo.addEdge(bog,bug,397);
        miGafo.addEdge(bog,med,416);
        miGafo.addEdge(med,buc,392);
    }

    private static Vertex getVertexByValue(String Bogotá) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
