import java.io.*;
import java.util.*;

//minimun
 public class Sol {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);

      int N = scn.nextInt();
      int M = scn.nextInt();
      int T = scn.nextInt();
      int C = scn.nextInt();
      
      ArrayList<Edge>[] graph = new ArrayList[N+1];
      for (int i = 0; i <= N; i++) {
         graph[i] = new ArrayList<>();
      }

      for (int i = 0; i < M; i++) {
         int v1 = scn.nextInt();
         int v2 = scn.nextInt();
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = 1;
      int des = N;
      // write your code here
      PriorityQueue<Pair> q = new PriorityQueue<>();
      q.add(new Pair(src, 0));
      boolean visited[] = new boolean[N+1];
      while(q.size() > 0){
            Pair p = q.remove();
            if(visited[p.src] == true)continue;
            visited[p.src]=true;
            if(p.src == des){
              System.out.println(p.time);
              break;
            }
            for(Edge e: graph[p.src]){
                if(visited[e.nbr] == false){
                    int greenRed = (p.time)%(2*T);
                    boolean isGreen = greenRed < T ;
                    int timeTaking = p.time+C;
                    if(!isGreen){
                      timeTaking += (2*T) - greenRed;
                    }
                    q.add(new Pair(e.nbr, timeTaking));
                }
            }
      }
   }
   public static class Pair implements Comparable<Pair>{
       int src;
       int time;
       Pair(int s, int t){
           src = s;
           time = t;
       }
       
       public int compareTo(Pair b){
           if(this.time < b.time){
               return -1;
           }else if(this.time == b.time){
               return 0;
           }
           return 1;
       }
   }
   
}