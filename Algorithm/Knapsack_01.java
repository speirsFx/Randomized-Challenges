import java.util.*;

class Knapsack_01{


  static List solution(int[] wts, int[] profit, int capacity){

    int[][] table=  new int[wts.length+1][capacity+1];

    for(int i = 0; i < table.length; i++){
      for(int j = 0; j < table[0].length; j++){
        System.out.println(i + " " + j);
        table[i][j] = 0;
      }
    }

    System.out.println("Here");

    for(int i = 1; i < wts.length + 1; i++){
      for(int j = 1; j < capacity + 1; j++){

        if(wts[i - 1] <= j ){
            table[i][j] = Math.max(profit[i - 1] + table[i - 1][j - wts[i - 1]], table[i - 1][j]);
        }
        else {
          table[i][j] = table[i-1][j];
        }
      }
    }

    int i = wts.length;
    int j = capacity;

    List<Integer> ans = new ArrayList<Integer>();

    while(i > 0 && j > 0){

      if(table[i][j] != table[i-1][j]){
        ans.add(i-1);
        j = j - wts[i-1];
      }

    i= i-1;
  }
  return ans;
  }


  public static void main(String[] args) {
    int[] profit = {1,2,5,6};
    int[] wts = {2,3,4,5};

    int capacity = 8;

    List<Integer> li = solution(wts, profit, capacity);

    for(int i : li){
      System.out.println(i);
    }
  }

}
