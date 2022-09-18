class insertionSortList {

  public ListNode insertionSortList(ListNode li){
  ListNode dummy = new ListNode(0,li);

  ListNode curr = li.next;
  ListNode prev = li;

  while(curr != null){

    if(curr.val > prev.val){
    prev = curr;
    curr = curr.next;
      continue;
    }

    ListNode tmp = dummy;

    while(tmp.next.val < curr.val)
      tmp = tmp.next;

    prev.next = curr.next;
    curr.next = tmp.next;
    tmp.next = curr;
    curr = prev.next;

  }

  return dummy.next;
}


}
