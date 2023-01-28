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

// DELETE THE NODE
// TO DELETE THE NODE WE NEED INORDER DECESSOR AND INORDER SUCCESSOR

  public static Node InPre(Node p){
    if( p != null && p.lchild != null )
          InPre(p.lchild);
      return p;
  }

  public static Node InSucc(Node p){
    if( p != null && p.rchild != null )
          InSucc(p.rchild);
      return p;
  }


  public static int height(Node p){

      int x,y;

      if(p == null){
        return 0;
      }
      x = height(p.rchild);
      y = height(p.lchild);

      if(x > y){
        return x + 1;
      }
      else return y + 1;
  }


  public static Node Delete(Node p, int key){

    Node q;
      if(p == null){
        return null;
      }


      if(p.data > key){
          p.lchild = Delete(p.lchild, key);
      }
      else if ( p.data < key){
        p.rchild = Delete(p.rchild, key);
      }

      else {

        if(height(p.lchild) > height(p.rchild)){
          q = InPre(p.lchild);
          p.data = q.data;
          p.lchild = Delete(p.lchild, q.data);
        }
        else {
          q = InSucc(p.rchild);
          p.data = q.data;
          p.rchild = Delete(p.rchild, q.data);
        }
      }

      return p;

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
