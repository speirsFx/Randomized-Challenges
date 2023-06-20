import java.util.PriorityQueue;

class Huffman {

  static   Node root;


    static Node huffmancode(int[] freq, char[] charArray){

      int n1 = freq.length;

        PriorityQueue<Node> q = new PriorityQueue<Node>(n1, new MyComparator());

        for(int i = 0; i < freq.length; i++){

          Node n = new Node();

          n.data = freq[i];
          n.c = charArray[i];

          n.left = n.right = null;

          q.add(n);
        }


      while(q.size() > 1){

        Node x = q.peek();
        q.poll();

        Node y = q.peek();
        q.poll();

        Node f = new Node();
        f.data = x.data + y.data;
        f.c = '-';

        f.left = x;
        f.right = y;

        root = f;

        q.add(f);

      }


      return root;

    }


    public static void printCode(Node root, String s)
     {


         if (root.left == null && root.right == null
             && Character.isLetter(root.c)) {


             System.out.println(root.c + ":" + s);

             return;
         }
         printCode(root.left, s + "0");
         printCode(root.right, s + "1");
          }



    public static void main(String[] args) {


      char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
      int[] charfreq = { 5, 9, 12, 13, 16, 45 };

      Node root =huffmancode(charfreq, charArray);

      printCode(root, "");

    }



}
