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
public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;
    
    public Edge(Vertex startV, Vertex endV, Integer inputWeight){
        this.start = startV;
        this.end = endV;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }
    
}
