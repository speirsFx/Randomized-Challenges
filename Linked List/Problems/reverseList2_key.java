class reverseList2 {
//Reversing the list for left as a key and right also cosidered as a key
  public static ListNode reverseBetween(ListNode head, int left, int right) {

      ListNode leftStart,leftEnd, midStart, midEnd, rightStart, rightEnd;


      if(head == null) {
        return null;
      }
      ListNode curr = head;

      leftStart = head;
      while( curr != null && curr.next != null && curr.next.val != left){
        curr = curr.next;
      }
      leftEnd = curr;
      midStart = curr.next;
      leftEnd.next = null;

      if(midStart == null) {
        return leftStart;
      }
      curr = midStart;
      while(curr.val != right && curr != null){
        curr = curr.next;
      }
      midEnd = curr;

      rightStart = curr.next;
      midEnd.next = null;

      curr = rightStart;
      rightEnd = null;



     midStart =  reverseList(midStart);

      leftStart = concatenate(midStart, leftStart);



      if(rightStart != null) {
      leftStart = concatenate(rightStart, leftStart);
      }



      return leftStart;


  }


  public static  ListNode reverseList(ListNode h1){

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

  public static ListNode concatenate(ListNode h1, ListNode h2){

      if(h2 == null){
        return h1;
      }

      else {
        ListNode currNode = h2;
        while(currNode.next != null){
          currNode = currNode.next;
        }
        currNode.next = h1;
      }

      return h2;
    }

}
