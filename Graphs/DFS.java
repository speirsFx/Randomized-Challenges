class DFS  {

    int[] visited = {0,0,0,0,0,0,0};
    int[][] G=  {{0,0,0,0,0,0,0},
                  {0,0,1,1,0,0,0},
                  {0,1,0,0,1,0,0},
                  {0,1,0,0,1,0,0},
                  {0,0,1,1,0,1,1},
                  {0,0,0,0,1,0,0},
                  {0,0,0,0,1,0,0}};


     void dfs(int start, int n){

      if(visited[start] == 0){
        System.out.println(start);
        visited[start] = 1;

        for(int j = 1; j < n; j++){
          if(visited[j] == 0 && G[start][j] == 1){
            dfs(j, n);
          }
        }
      }
    }


    public static void main(String[] args) {
      DFS d = new DFS();

      for(int i = 0; i < 7; i++) {
    	  for(int j = 0; j < 7; j++) {
    		  System.out.print(d.G[i][j] + " ");
    	  }
    	  System.out.println();
      }
      d.dfs(5, 7);
    }
}
