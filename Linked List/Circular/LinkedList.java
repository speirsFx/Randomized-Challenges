class LinkedList {

  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d){
      data = d;
      next = null;
    }

  }


  public static void insert(LinkedList list, int data){
    Node new_node = new Node(data);


    if(list.head == null){

      list.head = new_node;
      list.head.next = list.head;
    }
    else{
      Node curr_node = list.head;
      do {
          if(curr_node.next != list.head)
            curr_node = curr_node.next;

      }
      while (curr_node.next != list.head);

      curr_node.next = new_node;
      new_node.next = list.head;


    }
  }

  public static void printList(Node head){

    Node curr_node = head;

    do {

      System.out.println(curr_node.data);
      curr_node = curr_node.next;

    }
    while(curr_node != head);


  }

  public static Node last(Node head){

        Node curr_node = head;

        do {


          curr_node = curr_node.next;

        }
        while(curr_node.next != head);

        return curr_node;
  }



  public static void deleteHead(LinkedList list){
    Node curr_node = list.head;

    do {
      curr_node = curr_node.next;
    }
    while(curr_node.next != list.head);

    curr_node.next = list.head.next;
    list.head.next = null;
    list.head = curr_node;

    System.out.println("Head Deleted");



  }


  public static void main(String[] args) {

      LinkedList list = new LinkedList();

      list.insert(list, 4);
      list.insert(list, 44);

      list.printList(list.head);

      Node lastNode = last(list.head);
      System.out.println(lastNode.next.data);

      deleteHead(list);

      System.out.println(list.head.data);


  }

}
