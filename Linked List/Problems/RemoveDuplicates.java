class RemoveDuplicates {

  public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        if( head != null  && head.next != null){
          ListNode nextNode = head.next;
      } else {
        return head;
      }

      while(nextNode != null){
        if(currNode.val == nextNode.val){
          currNode.next = nextNode.next;
            nextNode = nextNode.next;

        }
        else {
          currNode = nextNode;
          nextNode = nextNode.next;
        }
      }

      return head;
     }
}
