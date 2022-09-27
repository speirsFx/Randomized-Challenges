class MergeIntervals {

  public static void sortbyColumn(int arr[][], int col)
   {

       Arrays.sort(arr, new Comparator<int[]>() {

         @Override
         public int compare(final int[] entry1,
                            final int[] entry2) {


           if (entry1[col] > entry2[col])
               return 1;
           else
               return -1;
         }
       });
   }
 public int[][] merge(int[][] intervals) {



   sortbyColumn(intervals,0);

   List<Integer> li = new ArrayList();
   List<List> res = new ArrayList();

    li.add(intervals[0][0]);
    li.add(intervals[0][1]);

res.add(li);


for(int i = 1; i < l; i++){

  li = new ArrayList();
    int lastEnd = (int)res.get(res.size()-1).get(1);

    if(lastEnd >= intervals[i][0]){
      res.set(res.size()-1, intervals[i][1]);
    }
    else {
      li.add(intervals[i][0]);
      li.add(intervals[i],[1]);
      res.add(li);
    }

}






int[][] result = new int[res.size()][2];
for(i = 0; i < res.size(); i++){
  result[i][0] = res.get(i).get(0);
  result[i][1] = res.get(i).get(1);
}

return result;

}

}
