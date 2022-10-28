class QueueUsingArray {

  static int rear = -1;
  static int front = -1;
    static  class Queue{
       int data;
       int size;
       int[] arr;


       Queue(int size)  {
         arr = new int[size];
       }

    }

    static void put(Queue Q,  int data){


      rear++;

      if(rear >= Q.arr.length)
        return;

      Q.arr[rear] = data;
    }

    static int pop(Queue Q){
      front++;

      if(front == rear)
        return -1;

      return Q.arr[front];
    }


    public static void main(String[] args) {

      Queue Q = new Queue(7);

      put(Q,8);
      System.out.println(pop(Q));


    }

}
