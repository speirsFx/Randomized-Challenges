class SwapNodes {

  public ListNode swapPairs(ListNode head) {
    Node temp = head;

            while (temp != null && temp.next != null) {

                int k = temp.val;
                temp.val = temp.next.val;
                temp.next.data = k;
                temp = temp.next.next;
            }
}

}
