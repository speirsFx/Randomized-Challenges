

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


    public  void Display(LinkedList list){

        Node currNode = list.head;

        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
        
    public static void main(String[] args){
        LinkedList li = new LinkedList();

        li = li.Insert(li, 8);
        li = li.Insert(li, 7);

        li.Display(li);
    }


}