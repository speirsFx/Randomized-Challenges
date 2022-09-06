class Rotate {

  public ListNode rotateRight(ListNode head, int k) {

      ListNode currLast = null;
      ListNode prevNode = head;

      if(head == null){
        return head;
      }
      else if(head.next == null){
        return head;
      }

      while(k != 0){
      while(prevNode.next.next != null){
        prevNode = prevNode.next;
      }
      currLast = prevNode.next;
      currLast.next = head;
      head = currLast;
      prevNode.next = null;
      k--;
    }

      return head;

    }

}
