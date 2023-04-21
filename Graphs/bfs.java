class BFS {

  int[] visited = {0,0,0,0,0,0,0};
  int[][] G=  {{0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0},
                {0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}};


  void bfs(int start, int n){

    int i = start;

    Queue q = new Queue();

    System.out.println(i);
    q.enqueue(i);

    while(q.isEmpty()){

      i = q.dequeue();

      for(int j = 1; j < n; j++){

        if(visited[j] == 0 && G[start][j] == 1){
          System.out.println(j);
          visited[j] = 1;
          q.enqueue(j);
        }
      }
    }
  }



  public static void main(String[] args) {

    BFS b = new BFS();

    b.bfs(2,7);
  }
}
