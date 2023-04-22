class Prims {

  int I = Integer.MAX_VALUE;
  int[][] G = {{I,I,I,I,I,I,I,I},
              {I,I,25,I,I,I,5,I},
              {I,25,I,12,I,I,I,10},
              {I,I,12,I,8,I,I,I},
              {I,I,I,8,I,16,I,14},
              {I,I,I,I,16,I,20,18},
              {I,5,I,I,I,20,I,I},
              {I,I,10,I,14,18,I,I}};
  int near[]={I,I,I,I,I,I,I,I};
  int[][] t = new int[2][6];


//near[] stores the value vertex nearer to its index near[1] = 2 ==> means 2 is nearer to 1

  void PrimsMST(){

    int i = 0,j = 0,l = 0,u = 0,v = 0, n = 7,k = 0, min = I;

    // Finding minimum cost
    for(i = 1; i <= n; i++){

      for(j = 1; j <=n; j++){
        if(G[i][j] < min){
          min = G[i][j];
          u = i;
          v = j;
        }
      }
    }

    System.out.println("Min " +u+ " " + v);

    t[0][0]= u;
    System.out.println(t[0][0]);
    t[1][0] = v;
    near[u] = 0;
    near[v] = 0;
System.out.println(near[0]);

    for( i = 1; i <=n; i++){
      if(near[i] != 0){
        if(G[i][u] < G[i][v]){
          near[i] = u;
        }
        else
          near[i] = v;
      }
    }

// for(int p : near){
//   System.out.println(i);
// }

    for(i = 0; i < n-1; i++){

      for(j = 1; j <=n; j++){

        min=I;
        if(near[j] != 0 && G[j][near[j]] < min){
          k = j;
          min = G[j][near[j]];
        }
      }

      t[0][i] = k;
      t[1][i] = near[k];
      near[k] = 0;

      for(j =1; j <= n; j++){
        if(near[j] != 0 && G[j][k] < G[j][near[j]])
            near[j] = k;
      }
    }

    for( i = 0; i < t[0].length; i++){
      System.out.println(" " + t[0][i] + " " +t[1][i]);
    }

  }


  public static void main(String[] args) {

    Prims p = new Prims();

    p.PrimsMST();


  }

}
