//Double Ended Queue
class DEQueue {

  static int front = 0;
  static int rear = 0;

    static class Queue {

      int arr[];

      Queue(int size) {
        arr = new int[size];
      }
    }

    static void frontEnqueue(Queue Q, int data){

      if(Math.floorMod(front-1, Q.arr.length) == rear){
        System.out.println("Queue is full");
        return;
      }

      front = Math.floorMod(front-1, Q.arr.length);
      Q.arr[front] = data;

    }

    static void rearEnqueue(Queue Q, int data){

      if(Math.floorMod(rear+1, Q.arr.length) == front){
        System.out.println("Queue is full");
        return;
      }

      rear = Math.floorMod(rear+1, Q.arr.length);
      Q.arr[rear] = data;
    }

    static int frontDequeue(Queue Q){
      if(front == rear){
        System.out.println("Queue is empty");
        return -1;
      }
      if (front != -1)
          Q.arr[front] = 0;
      front = Math.floorMod(front+1, Q.arr.length);
      return Q.arr[front];
    }

    static int rearDequeue(Queue Q){
      if(front == rear){
        System.out.println("Queue is empty");
        return -1;
      }
      if(rear != -1)
        Q.arr[rear] = 0;
      rear =Math.floorMod(rear-1, Q.arr.length);
      return Q.arr[rear];
    }


    public static void main(String[] args) {

      Queue Q = new Queue(8);

      rearEnqueue(Q, 8);
      frontEnqueue(Q,7);
      int x = frontDequeue(Q);

      System.out.println(front);
      System.out.println(rear);


    }

}
