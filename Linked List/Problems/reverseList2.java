class reverseList2 {

  public static ListNode reverseBetween(ListNode head, int m , int n) {
		ListNode dummy = new ListNode(0,head);
		ListNode  leftPrev = dummy;

		ListNode curr = head;

		for(int i = 0; i < m-1; i++) {
			leftPrev = curr;
			curr = curr.next;
		}

		ListNode prev = null;
		ListNode tmp;

		for(int i = 0; i < n-m+1; i++) {
			tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}

		leftPrev.next.next = curr;
		leftPrev.next = prev;
		return dummy.next;
	}
}
