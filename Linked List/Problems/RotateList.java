class RotateList {

  public ListNode rotateRight(ListNode head, int k) {

    ListNode currLast = head;
    ListNode prevNode = head;

    if(currLast == null){
      return head;
    }
    else if(currLast.next == null){
      return head;
    }

    int n = 0;
    while(prevNode != null){
        n++;
        prevNode = prevNode.next;
    }
    prevNode = head;

     k = k%n;
    System.out.println(n + " "+k);
      n = n-k-1;

    System.out.println(n);


    while (n > 0){
        n--;
        prevNode = prevNode.next;
    }

    System.out.println(prevNode.val);

    if(prevNode.next != null)
    {  currLast = prevNode.next;
           prevNode.next = null;
    }
    else return head;
    ListNode currNode = currLast;

  while(currNode.next != null){
      currNode = currNode.next;
  }

    currNode.next = head;
    head = currLast;




    return head;

  }

}
