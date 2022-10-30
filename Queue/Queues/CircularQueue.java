class CircularQueue {


    static int rear=0;
    static int front=0;

  static class Queue {
    int[] arr;

    Queue(int size){
      arr = new int[size];
    }
  }


  static void put(Queue Q, int data){

      if((rear+1)%Q.arr.length == front){
        System.out.println(rear);
        System.out.println("Queue is full");
        return;
      }
      else {

        rear = (rear+1)%Q.arr.length;
        Q.arr[rear] = data;
      }
  }


  static int pop(Queue Q){

    if(rear == front){
      System.out.println("Queue is empty");
      return -1;
    }
    front = (front + 1)%Q.arr.length;
    return Q.arr[front];
  }



  public static void main(String[] args) {
    Queue Q = new Queue(8);

    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);
    put(Q,2);



  }
}
