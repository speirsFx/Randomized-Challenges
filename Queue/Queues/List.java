class List {

  static Node front;
  static Node rear;

  static class Node{
    int data;
    Node next;
  }

  static Node push(int data){

    Node l = new Node();

    if(front == null){
      l.data = data;
      l.next = null;
      front = l;
    }
    else {
      Node currNode = front;
      while(currNode.next != null){
        currNode = currNode.next;
      }
    }
    rear = l;
    return front;
  }

  static int pop(){

     Node currNode = front;

     if(currNode == null){
       return -1;
     }
     int data = currNode.data;
     front = front.next;
     currNode.next = null;
     return data;

  }

  static void display(){
    Node currNode = front;

    while(currNode != null){
      System.out.println(currNode.data);
      currNode = currNode.next;
    }
  }

}
