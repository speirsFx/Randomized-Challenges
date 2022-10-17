//Array Implementation of Stack

class StackArray {

  int top;
  int size;
  int st[];

    StackArray(int size){
    this.size = size;
    st= new int[size];
    this.top = -1;
  }

  public void push(int x){

    if( top >= size - 1){
      return;
    }
    else {
      top++;
      st[top] = x;
    }
  }

  public int pop(){
    int x;
    if(top <= -1){
      System.out.println("Stack Underflow");
      return -1;
    }
    else {
      x = st[top];
      top--;
    }

    return x;
  }


  public Boolean isEmpty(){

    if(top <= -1){
      return true;
    }
    else return false;
  }


  public Boolean isFull(){

    if(top >= size){
      return true;
    }
   return false;
  }

  public static void main(String[] args) {

    StackArray stack = new StackArray(8);

    stack.push(7);
    stack.push(8);
    stack.push(9);
    stack.push(10);
    stack.push(11);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    System.out.println(stack.top);

  }


}
