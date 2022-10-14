class ParenthesisMatching {

  static Node top;

  static class Node {

    Node next;
    char val;

    Node(){

    }

    Node(Node next, char data){
      this.next = next;
      this.val = data;
    }
  }

  public static void  push(char data){

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




  public static char pop(){
    char x = '1';
    if(top == null){
      System.out.println("Stack Overflow");
      return '1';
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


  static Boolean isBalance(String s){

    for (int i = 0; i < s.length() ; i++ ) {

      if(s.charAt(i) == '('){
        push(s.charAt(i));

      }
      if(s.charAt(i) == ')'){
        char x = pop();
        if(x == '1'){
          return false;
        }
      }
    }

    if(top != null){
      return false;
    }

return true;
  }





    public static void main(String[] args) {

      String s = "(a+b)-(c+d))";

      Boolean check = isBalance(s);

      System.out.println(check);


    }


}
