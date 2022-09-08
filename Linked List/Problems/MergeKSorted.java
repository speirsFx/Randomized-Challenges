class MergeKSorted {

  public ListNode mergeKLists(ListNode[] lists) {

    int n = lists.length;
    if(n == 0){
      return null;
    }
    if(n == 1){
      return lists[0];
    }
    if(n == 2){
      return merge2List(lists[0], lists[1]);
    }
    ListNode node3 = merge2List(lists[0], lists[1]);




    for(int i = 2; i < lists.length; i++){
      ListNode currNode1 = node3;
      ListNode currNode2 = lists[i];

      node3 = merge2List(currNode1, currNode2);



    }
    return node3;

  }

  public static ListNode merge2List(ListNode node1, ListNode node2){

      ListNode curr1 = node1;
      ListNode curr2 = node2;
      ListNode curr3 = null;
      ListNode head = null;

      if(node1 == null ){
             return node2;
         }
         else if ( node2 == null ){
             return node1;
         }

      if(node1.val > node2.val){
        head = node2;
        curr3 = node2;
        curr2 = curr2.next;
        curr3.next = null;
      }else {
        head = node1;
        curr3 = node1;
        curr1 = curr1.next;
        curr3.next = null;
      }

      while( curr1 != null && curr2 != null){
        if(curr1.val > curr2.val){
          curr3.next = curr2;
          curr3 = curr2;
          curr2 = curr2.next;
          curr3.next = null;
        }
        else {
          curr3.next = curr1;
          curr3 = curr1;
          curr1 = curr1.next;
          curr3.next = null;
        }
      }

      if(curr1 == null && curr2 != null){
       curr3.next = curr2;
   }
   else if(curr2 == null && curr1 != null)
       curr3.next = curr1;
    return head;
    }



}
