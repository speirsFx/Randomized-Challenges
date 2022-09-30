class StackUsingLinkedList {
    static Node top;

    static class Node {

      Node next;
      int val;

      Node(){

      }

      Node(Node next, int data){
        this.next = next;
        this.val = data;
      }
    }

    public static void  push(int data){

      Node add  = null;

      if(top == null){
        add = new Node(null, data);
        top = add;
        add.val = data;

      }
      else {
        add = new Node(top, data);
        add.val = data;

        top = add;
      }
    }




    public static void pop(){
      int x = -1;
      if(top == null){
        System.out.println("Stack Overflow");
      }
      else {
        Node popped = top;
        top = top.next;
        x = popped.val;
        popped.next = null;
        popped = null;
      }


    }




    public static void main(String[] args) {
      top = new Node();

      push(5);
      push(51);
      pop();

      System.out.println("Hello");

      System.out.println(top.val);

    }


}
