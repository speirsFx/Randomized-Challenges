class SpiralMatrix2 {
  public int[][] generateMatrix(int n) {

      int top = 0, bottom = n;
      int left = 0, right = n;
      int count = 1;

      if(n == 0){
        return null;
      }

      int result[][] = new int[n][n];

      while(top < bottom && left < right) {

        for(int i = left; i < right; i++){
          result[top][i] = count;
          count++;
        }

        top++;

        for(int i = top; i < bottom; i++){
          result[i][right-1] = count;
          count++;

        }

        right--;

        if( left < right && top < bottom){
          for(int i = right - 1; i >= left; i--){
            result[bottom-1][i] = count;
            count++;
          }

          bottom--;


          for(int i = bottom-1; i >= top; i--){
            result[i][left] = count;
            count++;
          }

          left++;
        }


      }

    return result;
  }
  
}
