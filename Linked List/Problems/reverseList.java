class reverseList {

  public  ListNode reverseList(ListNode h1){

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



}
