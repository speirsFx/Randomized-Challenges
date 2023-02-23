class Queue {

  static Node front;
  static Node rear;

  static class Node<T>{
    T data;
    Node next;
  }



    public void enqueue(T x){

        Node currNode = front;
        Node newNode = new Node();

        if(currNode == null){
            currNode = newNode;
            currNode.data = x;
            rear = currNode;
            front = currNode;
        }
        else {

          while(currNode != rear){
            currNode = currNode.next;
          }
          currNode.next = newNode;
          currNode.data = x;
          currNode = newNode;
          currNode.next = rear;
          rear = currNode;

        }
    }


    public T dequeue(){

      if(front == null){
        System.out.println("Stack Underflow");
        return null;
      }

      if(front == rear){
        Node currNode = front;
        front = null;
        return currNode.data;
      }

      else {
        T data = front.data;
        Node currNode = front;
        front = front.next;
        rear.next = front;
        currNode.next = null;
        currNode = null;
        return data;
      }


    }




}
