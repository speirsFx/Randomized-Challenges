class QueueUsingList {


  static void enqueue(int data, List li){
    li.push(data);

  }

  static int dequeue(List li){
    int x = li.pop();
    return x;
  }

  static void display(List li){


  }

  public static void main(String[] args) {
    List li = new List();

    enqueue(8,li);
    li.display();
    System.out.println(dequeue(li));
    li.display();

  }

}
