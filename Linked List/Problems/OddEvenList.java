class OddEvenList {

  public ListNode oddEvenList(ListNode head) {


    if(head == null || head.next == null || head.next.next == null ){
      return head;
    }

    ListNode fst = head.next;
    ListNode curr = head;
    curr.next = curr.next.next;
    curr  = curr.next;
    head = insertAtLast(head, fst);

    while(curr != fst && curr.next != fst){
      ListNode insert = curr.next;
      curr.next = curr.next.next;
        curr = curr.next;
        head = insertAtLast(head, insert);
    }

    return head;

  }

  public static ListNode insertAtLast(ListNode head, ListNode node){

    if(head == null ){
      return node;
    }
    ListNode currNode = head;
    while(currNode.next != null){
      currNode = currNode.next;
    }
    currNode.next = node;
    node.next = null;

    return head;

  }



}
