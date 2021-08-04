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
    int edges = in.nextInt();
    for(int i = 0;i < edges;i++){
        String[] parts = in.nextLine().split(" ");
        int v1 = Integer.parseInt(parts[0]);
        int v2 = Integer.parseInt(parts[1]);
        int wt = Integer.parseInt(parts[2]);
        graph[v1].add(new Edge(v1,v2,wt));
        graph[v2].add(new Edge(v2,v1,wt));
    }
    int src = in.nextInt();
    int dest = in.nextInt();

    boolean[] visited = new boolean[vtces];
    boolean path = hasPath(graph, src, dest,visited);
}
public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest, boolean[] visited){
    if(src==dest){
        return true;
    }
    for(ArrayList<Edge> edge : graph[src]){
        boolean hasNbrPath = hasPath(graph, src, dest, visited);
        if(hasNbrPath == true){
            return true;
        }
    }
    return false;
}
}