class reverseKGroupNodes {

  public static ListNode reverseKGroup(ListNode head, int k) {

      ListNode currNode = head;
      int length = 0;

      while(currNode != null){
        length++;
        currNode = currNode.next;
      }
      ListNode head1, last1, res;
      res = null;
      System.out.println("Length" +length);

      int m = length/k;

      int j = 0;
      while(j < m )
      {
              int z = 1;
              head1 = last1 = head;
              if(head == null){
                break;
              }
              while(z < k && head1 != null){
                          last1 = last1.next;
                          z++;
                        }
              head = last1.next;
              last1.next = null;


               head1 = reverseList(head1);
               res = concatenate(head1, res);


              j++;


      }

      if(head != null){
          res = concatenate(head, res);
      }
      return res;

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
