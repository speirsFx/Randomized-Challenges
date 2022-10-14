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




    public static int pop(){
      int x = -1;
      if(top == null){
        System.out.println("Stack Overflow");
        return -1;
      }
      else {
        Node popped = top;
        top = top.next;
        x = popped.val;
        popped.next = null;
        popped = null;

      }

      return x;
    }




    public static void main(String[] args) {


      push(5);
      push(51);


      System.out.println(pop());
      System.out.println(pop());
      System.out.println(pop());
    }


}
