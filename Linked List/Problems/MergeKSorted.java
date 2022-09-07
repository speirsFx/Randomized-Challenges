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




    for(int i = 3; i < lists.length; i++){
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
      node2 = node2.next;
      curr3.next = null;
    }else {
      head = node1;
      curr3 = node1;
      node1 = node1.next;
      curr3.next = null;
    }

    while( node1 != null && node2 != null){
      if(node1.val > node2.val){
        curr3.next = node2;
        curr3 = node2;
        curr3.next = null;
        node2 = node2.next;
      }
      else {
        curr3.next = node1;
        curr3 = node1;
        curr3.next = null;
        node1 = node1.next;
      }
    }

    if(node1 == null && node2 != null){
     curr3.next = node2;
 }
 else if(node2 == null && node1 != null)
     curr3.next = curr1;
  return head;
  }



}
