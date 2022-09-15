class ReorderList {



  	public static void reorderList(ListNode head) {
  	    int length = 0;
  	    ListNode currNode = head;
  	    while(currNode != null){
  	      length++;
  	      currNode = currNode.next;
  	    }

  	    int m = length/2;

  	    if(length%2 == 0)
  	    	m = m-1;
  	    ListNode fst = head;

  	    while(m != 0){
  	      fst = fst.next;
  	      m--;
  	    }

  	    ListNode snd = fst.next;
  	    fst.next = null;

  	    snd = reverseList(snd);

  	    head = concatenateReorder(head, snd);





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




  	public static ListNode concatenateReorder(ListNode fst, ListNode snd) {
  		if(fst == null) {
  			return null;
  		}
  		if(fst != null && snd == null) {
  			return null;
  		}

  		ListNode head = fst;
  		ListNode curr1, curr2;

  		while(snd != null && fst != null ) {

  			curr1 = fst;
  			fst = fst.next;
  			curr1.next = snd;

  			curr2 = snd;
  			snd = snd.next;
  			curr2.next = fst;
  		}





  		return head;
  	}

}
