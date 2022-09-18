class removeListNode {

  public ListNode removeElements(ListNode head, int val) {


      ListNode dummy = new ListNode(0, head);
       ListNode curr = head;
      ListNode prev = dummy;


      if(head == null)
          return null;

      while(curr!=null){
          if(curr.val == val){
              prev.next = curr.next;
              curr = curr.next;
              continue;
          }

          prev = curr;
          curr = curr.next;

      }

      return dummy.next;

  }
  
}
