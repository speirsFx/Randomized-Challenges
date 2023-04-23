class inorderTraversal {

List<Integer> li = new ArrayList<Integer>();

  public List<Integer> inorderTraversal(TreeNode root) {
      if(root == null){
          return li;
      }
      else {
          inorderTraversal(root.left);
          li.add(root.val);
          inorderTraversal(root.right);
      }
      return li;
  }
}
