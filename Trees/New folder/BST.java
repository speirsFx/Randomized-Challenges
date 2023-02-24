public class BST {
    
    Node root;

    Node insert(int data){

        Node node = new Node(data);

        if(root == null){
            root = node;
        }

        else {
            Node currNode = root;
            while(true) {
                if(currNode.data == data){
                    return root;
                }
                if(currNode.right != null && data > currNode.data){
                    currNode = currNode.right;
                }
                else if(currNode.left != null && data < currNode.data){
                    currNode = currNode.left;
                }
                else {
                    break;
            }
        }

        if(currNode.data > data){
            currNode.left = node;
        }
        else{
            currNode.right = node;
        }


        }
        return root;
    }

    //Height of the binary tree
    int Height(Node node){

        int x,y;
        if(node == null){
            return 0;
        }
       
        x = Height(node.left);
        y = Height(node.right);
        
        if(x > y){
            return x+1;
        }
        return y + 1;
        
    }


    Node InPre(Node p){

        while(p != null && p.right != null )
            p = InPre(p.right);
        return p;
    }


    Node InSucc(Node p){

        while(p != null && p.left != null )
            p = InPre(p.left);
        return p;
    }

    Node Delete(int data, Node node){

        if(node == null)
            return null;
        
            if(node.left ==  null && node.right == null)
            {
                if(node == root)
                    root = null;
                return null;
            }
        else {

            if(data > node.data)
                node.right = Delete(data, node.right);
                else if (data < node.data) {
                    node.left = Delete(data, node.left);
                }
            else {

                if(Height(node.left) > Height(node.right)){
                    Node  q = InPre(node.left);
                    node.data = q.data;
                    node.left = Delete(q.data, node.left); 
                }

                else {
                    Node  q = InSucc(node.right);
                    node.data = q.data;
                    node.right = Delete(q.data, node.right); 
                }

            }
                
            
            }

            return node;
        }
        




    void InOrder(Node node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.data +" ");
        InOrder(node.right);
    }



    public static void main(String[] args) {
        
        BST tree = new BST();

        tree.insert(9);
        tree.insert(90);
        tree.insert(8);
        tree.insert(8);
        tree.insert(7);
        tree.insert(88);
        tree.insert(2);
        tree.insert(0);
        tree.insert(-1);
        System.out.println(tree.root.left.data);
        System.out.println(tree.root.right.data);

        tree.Delete(7, tree.root);
        tree.Delete(9, tree.root);
        tree.InOrder(tree.root);
        System.out.println("root"+tree.root.data);


    }
}
