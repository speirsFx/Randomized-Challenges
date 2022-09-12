//Partition but in a  manner that all snall nodes are behinf key Not working for leet code question

class PartitionList {

  public static ListNode partition(ListNode head, int x) {
        ListNode keyNode = null;
        ListNode currNode = head;

        if(head == null) {
          return head;
        }

        while(currNode.val != x && currNode != null){
          currNode = currNode.next;
        }

        keyNode = currNode;

        System.out.println(keyNode.val);

        ListNode prevNode = currNode;
        currNode = currNode.next;

        while(currNode != null){
          if(currNode.val < x){
            prevNode.next = currNode.next;
            currNode.next = null;
            head = insertSort(head, currNode, x);
            currNode = prevNode.next;
          }
          else {
            prevNode = currNode;
            currNode = currNode.next;

          }
        }

        return head;

  }





    public static ListNode insertSort(ListNode head,ListNode currNode, int x){

      if(head == null || head.val >= x){
        currNode.next = head;
        head = currNode;
      }
      else {

        ListNode node1 = head;
        while(x > node1.next.val && node1 != null){
          node1 = node1.next;
        }
          currNode.next = node1.next;
          node1.next = currNode;

      }
      return head;
    }
}
