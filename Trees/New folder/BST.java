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

        tree.InOrder(tree.root);


    }
}
