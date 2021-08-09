package graph;

import java.io.*;
import java.util.*;
public class allpath{
    static class Edge{    
    int src;
    int nbr;
    int wt;

    Edge(int src, int nbr, int wt){
        this.src = src;
        this.nbr = nbr;
        this.wt = wt;
    }}

public static void main(String[] args) {

  Scanner in = new Scanner(System.in);   
    int vtces = in.nextInt();
    ArrayList<Edge>[] graph = new ArrayList[vtces];
    for(int i=0;i<vtces;i++){
        graph[i] = new ArrayList<>();
    }
    
}
}