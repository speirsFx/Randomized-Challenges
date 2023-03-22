class Heap{

    static void insert(int A[], int n){
        int temp;
        temp = A[n];
        int i = n;
        while(i > 0 && temp > A[i/2]){
            A[i] = A[i/2];
            i = i/2;
        }

        A[i] = temp;
    }

    static void swap(int A[], int i,int j){
        int temp = A[i];

        A[i] = A[j];
        A[j] = temp;
    }

    static int delete(int A[], int n){

        int val = A[0];
        A[0] = A[n];
        A[n] = val;

        int i = 0; 
        int j = 2*i;

        while(j < n-1){
            if(A[j+1] > A[j])
                j = j+1;

                if(A[i] < A[j]){
                    swap(A, i, j);
                    i = j;
                    j = 2*j;
                }

                else { 
                    break;
                }
            
        }

        return val;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,455,6,7,8};


        for(int i = 0 ; i <  arr.length; i ++){

            insert(arr,i);
        }
    
      
        for(int i = arr.length-1 ; i >= 0; i --){
            System.out.println(delete(arr,i));
        }
       
        
    }

} 