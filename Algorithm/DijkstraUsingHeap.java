import java.util.*;
import java.lang.*;
import java.io.*;

class DijkstraUsingHeap {

  List<List<pair>> adj;


  DijkstraUsingHeap(int v){
    adj = new ArrayList<>();

    for(int i = 0; i < v; i++){
      adj.add(new ArrayList<>());
    }
  }



  static class pair{
    int node, distance;

    pair(int node, int distance){
      this.node = node;
      this.distance = distance;
    }

  }



  void addEdge(int u, int v, int w){
    adj.get(u).add(new pair(v,u));
    adj.get(v).add(new pair(u,w));
  }


  int[] dijkstra(int src, int V){
    PriorityQueue<pair> pq = new PriorityQueue<>(V, Comparator.comparingInt(o -> o.node));
    int[] dist = new int[V];
    Arrays.fill(dist, Integer.MAX_VALUE);

    pq.add(new pair(0, src));
    dist[src] = 0;

    while (!pq.isEmpty()) {
        int u = pq.poll().distance;

        for (pair v : adj.get(u)) {
            if (dist[v.node] > dist[u] + v.distance) {
                dist[v.node] = dist[u] + v.distance;
                pq.add(new pair(dist[v.node], v.node));
            }
        }
      }

        return dist;
}



public static void main(String[] args) {
    int V = 9;
    DijkstraUsingHeap g = new DijkstraUsingHeap(V);

    g.addEdge(0, 1, 4);
    g.addEdge(0, 7, 8);
    g.addEdge(1, 2, 8);
    g.addEdge(1, 7, 11);
    g.addEdge(2, 3, 7);
    g.addEdge(2, 8, 2);
    g.addEdge(2, 5, 4);
    g.addEdge(3, 4, 9);
    g.addEdge(3, 5, 14);
    g.addEdge(4, 5, 10);
    g.addEdge(5, 6, 2);
    g.addEdge(6, 7, 1);
    g.addEdge(6, 8, 6);
    g.addEdge(7, 8, 7);
     int[] dist = g.dijkstra(0, V);
    for(int i = 0; i < dist.length; i++){
      System.out.println(i +" len " +dist[i]);
    }
}

}
