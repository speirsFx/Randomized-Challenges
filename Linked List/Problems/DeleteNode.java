class DeleteNode {

  public void deleteNode(ListNode node) {
      ListNode prev = new ListNode(0);


  while(node != null && node.next != null){

      node.val = node.next.val;
       prev.next = node;
      node = node.next;

  }

//  while(prev != null){
//      System.out.println(prev.val);
//      prev = prev.next;
//  }
//
      prev.next.next = node.next;

}

}
