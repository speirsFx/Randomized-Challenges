class BST {

static Node root;

  static class Node {
    int data;
    Node rchild;
    Node lchild;
  }

  public static void Insert(Node t, int key){

    Node r,x,z;

    x = t;
    r = x;
    while(x!=null){
      r = x;

      if(key == x.data){
        return;
      }
      else if (key > x.data){
        x = x.rchild;
      }
      else {
        x = x.lchild;
      }
    }

    z = new Node();
    z.data = key;
    z.rchild = z.lchild = null;
    if(key > r.data)
      r.rchild = z;
    else r.lchild = z;



  }


  public static void main(String[] args) {

    root = new Node();
    root.data = 10;

    Insert(root, 100);
    Insert(root, 9);

    System.out.println(root.rchild.data);
    System.out.println(root.lchild.data);

  }

}
