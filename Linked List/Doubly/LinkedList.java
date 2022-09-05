package Doubly;

public class LinkedList {

  Node head;

  static class Node {

    Node next;
    Node prev;
    int data;

    Node(int d){
      data = d;
      next= null;
      prev = null;
    }

  }

  public  LinkedList insert(LinkedList list, int data){

    Node add = new Node(data);

    if(list.head == null ){
      list.head = add;
    }
    else {
      Node curr_node = list.head;

      while(curr_node.next != null){
        curr_node = curr_node.next;
      }
      curr_node.next = add;
      add.prev = curr_node;

    }

    System.out.println("Inserted");
    return list;

  }

  public  void display(Node head){

    Node curr_node = head;

    System.out.println("display");

    while(curr_node.next != null){

      curr_node = curr_node.next;

    }

    while(curr_node != null){
      System.out.println(curr_node.data);
      curr_node = curr_node.prev;
    }

  }


    public static void main(String[] args) {
      LinkedList list = new LinkedList();
    
        list = list.insert(list, 95);
        list = list.insert(list, 9);
        list = list.insert(list, 9);
        list = list.insert(list, 9);
        list = list.insert(list, 9);
        list = list.insert(list, 9);
        list = list.insert(list, 9);
        list = list.insert(list, 9);
        list = list.insert(list, 93);
        list = list.insert(list, 91);
    
      System.out.println(list.head.data);
    
      list.display(list.head);
    
    }


}
