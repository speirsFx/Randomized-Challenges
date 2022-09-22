class Palindrome {

  public static ListNode insert(ListNode head, int val){

      ListNode head1 = new ListNode(val);
      head1.next = null;

      if(head == null){
          head = head1;
        }
      else {
        ListNode curr = head;

        while(curr.next != null){
          curr = curr.next;
        }
        System.out.println("Inserted");
        curr.next = head1;
      }

      return head;
    }

  public static ListNode reverseList(ListNode h1){

      ListNode fst = null, snd =null;
      ListNode thd = h1;

      while(thd != null){
        fst = snd;
        snd= thd;
        thd = thd.next;
        snd.next = fst;
      }
      return snd;
    }

public Boolean isPalindrone(ListNode li){

  if(li == null && li.next == null){
    return true;
  }

  ListNode node = new ListNode(li.val);

  ListNode curr = li.next;
  while(curr != null){
    node = insert(node, curr.val);
    curr = curr.next;
  }

  ListNode node = reverseList(node);

  while(li != null && node != null){
    if(li.val != node.val){
      return false;
    }
  }
return true;
}

}
