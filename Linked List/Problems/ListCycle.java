class ListCycle {

  public boolean hasCycle(ListNode head) {

    ListNode curr = head, jump2Times = head;

      if(head == null){
          return false;
      }

    while(curr !=null && jump2Times != null && jump2Times.next != null){
         curr = curr.next;
        jump2Times = jump2Times.next.next;
      if(curr == jump2Times){
        return true;
      }

    }

    return false;
}
