class Flatten {

  public void flatten(TreeNode node)
   {

       if (node == null)
           return;

       if (node.left == null && node.right == null)
           return;

       if (node.left != null) {

           flatten(node.left);

           TreeNode tempNode = node.right;
           node.right = node.left;
           node.left = null;

           TreeNode curr = node.right;
           while (curr.right != null)
               curr = curr.right;

           curr.right = tempNode;
       }

       flatten(node.right);
   }
}
