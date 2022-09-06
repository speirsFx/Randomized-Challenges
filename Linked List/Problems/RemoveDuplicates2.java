class RemoveDuplicates2 {

  public ListNode deleteDuplicates(ListNode head) {


  ListNode dummy = new ListNode(0);

  dummy.next = head;
  ListNode prev = dummy;
  ListNode current = head;

  while (current != null)
  {
      while (current.next != null &&
             prev.next.val == current.next.val)
             current = current.next;


      if (prev.next == current)
          prev = prev.next;


      else
          prev.next = current.next;

      current = current.next;
  }

  head = dummy.next;

  return head;
  }
}
