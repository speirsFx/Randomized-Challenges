package Singly;

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


    //Insert a Node at the last
    public LinkedList Insert(LinkedList list, int data) {
        Node newNode = new Node(data);

        if(list.head == null) {
            list.head = newNode;
            list.head.next = null;
        } else {
            Node curr_node = list.head;

            while(curr_node.next != null){
                curr_node = curr_node.next;
            }
            curr_node.next = newNode;

        }

        return list;
    }


    //Print the list data
    public  void Display(LinkedList list){

        Node currNode = list.head;
        if(currNode == null){
            return;
        }
        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }


    //Delete the lasy Node
    public static LinkedList deleteLastNode(LinkedList list){

      if(list.head == null){
        return null;
      }
      else{
        Node currNode = list.head;
        if (currNode.next == null){

            list.head = null;
            return list;
            
        }

        while(currNode.next.next != null){
          currNode = currNode.next;
        }
        Node l = currNode.next;
        currNode.next = null;
        System.out.println(l.data);

      }

      return list;
    }

    public static void main(String[] args){
        LinkedList li = new LinkedList();

        li = li.Insert(li, 8);


        li.Display(li);
        li = deleteLastNode(li);

        System.out.println("S");
        li.Display(li);
    }


}
