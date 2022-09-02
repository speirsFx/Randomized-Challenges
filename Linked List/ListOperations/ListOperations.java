package java.list.ListOperations;

class ListOperations {

    static class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    } 

    public static void Insert(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            head.next = null;
        } else {
            Node curr_node = head;

            while(curr_node != null){
                curr_node = curr_node.next;
            }
            curr_node = newNode;
            
        }
        

    }




}