import java.util.*;

class Tree {

  Node root;

  static class Node{
    int data;
    Node lchild;
    Node rchild;
  }

  public static void createTree(){

    Scanner myObj = new Scanner(System.in);

    Queue q = new Queue();
    Node p,t;

    System.out.println("Enter the root value");
    int data = myObj.nextInt();
    Node root= new Node();
    root.data = data;
    root.lchild=null;
    root.rchild=null;
    q.enqueue(root);

    while(!q.isEmpty())
      {
              p=q.dequeue();
              System.out.println("enter left child of " +p.data);
              data = myObj.nextInt();
        if(x!=-1)
          {
            t=new Node();
            t.data=data;
            t.lchild=t.rchild=null;
            p.lchild=t;
            q.enqueue(t);
          }
            System.out.println("enter right child of " +p.data);
            System.out.println("enter left child of " +p.data);
            data = myObj.nextInt();
          if(x!=-1)
          {
            t=new Node();
            t.data=data;
            t.lchild=t.rchild=null;
            p.rchild=t;
            q.enqueue(t);
          }
        }

  }


    public static void main(String[] args) {






    }

}
