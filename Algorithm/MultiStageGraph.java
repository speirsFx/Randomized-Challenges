class MultiStageGraph {


  static int[] shortestPath(int[][] c){

      int[] cost = new int[c.length];
      int[] d = new int[c.length];
      int[] path = new int[c.length];



      for(int i = n-1; i >= 1; i--){
        int min = Integer.MAX_VALUE;
        for (int j = i+1;j <=n  ;j++ ) {

          if(c[i][j] != 0 && c[i][j] + c[j] < min){
            min = c[i][j] + c[j];
            d[i] = k;
          }
        }
        cost[i] = min;
      }

      //Stages

  }


  public static void main(String[] args) {

    int[][] c = {{0 ,0 ,0 ,0 ,0, 0, 0. 0},
                 {0, 0, 2, 1, 3, 0, 0, 0},
                 {0}
                }
  }
}
