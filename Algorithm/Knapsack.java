import java.util.*;


class Knapsack {

  double maxProfit(int[][] li, int maxCapacity){

    int len = li.length;
    double[] pw = new double[len];

    for(int i = 0; i < len; i++){
      pw[i] = (li[i][0]) * 1.0/ (li[i][1]);
    }
    for(double k : pw) {
      System.out.print(k +" ");

    }
      System.out.println();
    double profit = 0;


    int  capacity = maxCapacity;
    while(capacity > 0){
      double max =Double.MIN_VALUE;

      int i = 0;
      for(int j = 0; j < len; j++) {
        if(max < pw[j] ){
          max = pw[j];
          i = j;
        }
      }

    if(capacity - li[i][1] < 0){
      int wt = li[i][1] - capacity + 1 ;
      System.out.println(capacity);

      profit += pw[i]*(capacity);
      pw[i] = -1;

      System.out.print("Capacity less 0 ");
      System.out.print(wt +" ");
      System.out.print(capacity+" ");
      System.out.print(li[i][0]+" ");
        System.out.print(li[i][1]+" ");
      System.out.print(" "+profit);
      System.out.println();
      capacity = 0;
    }
    else {
      profit += li[i][0]*1.0;
          System.out.print("Capacity > 0 ");
        System.out.print(capacity +" ");
        System.out.print(li[i][0]+" ");
          System.out.print(li[i][1]+" ");
        System.out.print(" "+profit);
        System.out.println();

      pw[i] = -1;
      capacity -= li[i][1];
    }

        for(double k : pw) {
          System.out.print(k +" ");

        }
          System.out.println();

    }
return profit;
  }





public static void main(String[] args) {

  Knapsack k = new Knapsack();

  int[][] li = {{10,2}, {5,3}, {15,5}, {7,7}, {6,1}, {18,4}, {3,1}};

  System.out.println(k.maxProfit(li,7));
}
}
