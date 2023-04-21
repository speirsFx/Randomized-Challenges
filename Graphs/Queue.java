class Queue {

  Node first;
  Node last;

  void enqueue(int data){
    Node node = new Node(data);

    if(first == null){
      first = last = node;
    }
    else {
      last.next = node;
    }
  }


  int dequeue(){
    if(first == last){
      int data = first.data;
      first = last = null;
      return data;
    }

    else {
      int data = first.data;
      first = first.next;
      return data;
    }
  }

  Boolean isEmpty(){

    if(first == null){
      return true;
    }

    return false;
  }
}
