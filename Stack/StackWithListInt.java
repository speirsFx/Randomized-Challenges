import static java.lang.System.exit;


//char stack
class StackWithListInt {


    private class Node {

        int data;
        Node link;
    }

    Node top;

    StackWithListInt() { this.top = null; }


    public void push(int x)
    {

        Node temp = new Node();


        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }


        temp.data = x;


        temp.link = top;


        top = temp;
    }


    public boolean isEmpty()
    {
      return top == null;
    }


    public int stackTop()
    {

        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }


    public int pop()
    {

        if (top == null) {
            System.out.print("\nStack Underflow");
            return -1;
        }

        Node x = top;
        top = (top).link;
        x.link = null;
        int y =  x.data;
        x = null;
        return y;

    }

    public void display()
    {

        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {


                System.out.print(temp.data);


                temp = temp.link;
                if(temp != null)
                    System.out.print(" ");
            }
        }
    }
}
