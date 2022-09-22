class Palindrome2 {


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


public static Boolean isPalindrome(ListNode li) {

  if(li == null || li.next == null) {
    return true;
  }

  ListNode dummy = new ListNode(-1,li);
  ListNode slowPtr = dummy;
  ListNode fastPtr = dummy;

  while(fastPtr != null && fastPtr.next != null) {
    slowPtr = slowPtr.next;
    fastPtr = fastPtr.next.next;
  }

  fastPtr = slowPtr.next;



  slowPtr.next = null;


  fastPtr = reverseList(fastPtr);


  while(fastPtr != null) {
    if(li.val != fastPtr.val) {
      return false;

    }

    fastPtr = fastPtr.next;
    li = li.next;

  }

  return true;

}

}
