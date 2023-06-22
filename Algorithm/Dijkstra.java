class Dijkstra {

  static int minDistance(int[] dist, Boolean[] setV){

    int min = Integer.MAX_VALUE;
    int min_Index = -1;

    for(int i = 0; i < 9; i++){
      if(setV[i] == false && dist[i] <= min){
        min = dist[i];
        min_Index = i;
      }
    }


    return min_Index;
  }

  int[]  dijkstra(int[][] graph, int src){

    Boolean setV[] = new Boolean[graph.length];

    int dist[] = new int[graph.length];

    for(int j = 0; j < graph.length; j++){
      dist[j] = Integer.MAX_VALUE;
      setV[j] = false;
    }

    dist[src] = 0;


    for(int count = 0; count < graph.length - 1; count++){


        int u = minDistance(dist, setV);
        System.out.println(u);

        setV[u] = true;

        for(int i = 0; i < graph.length; i++){

          if(setV[i] == false && graph[u][i] != 0
          && dist[u] != Integer.MAX_VALUE
          && dist[u] + graph[u][i] < dist[i]){
            dist[i] = dist[u] + graph[u][i];

          }
        }

    }

  return dist;

  }


  public static void main(String[] args) {
    int graph[][]
           = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                           { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                           { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                           { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                           { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                           { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                           { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                           { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                           { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

                           System.out.println(graph.length);
       Dijkstra t = new Dijkstra();

       int[] dist = t.dijkstra(graph, 0);

       for(int i = 0; i< dist.length; i++){
         System.out.println(i+"  "+dist[i]);
       }



  }

}
