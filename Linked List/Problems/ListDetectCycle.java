public ListNode detectCycle(ListNode head) {

     ListNode slowPtr = head,fastPtr = head;
     int index;


     List<ListNode> arr = new ArrayList();

     while(slowPtr != null )
     {
         if(arr.contains(slowPtr)){
             index = arr.indexOf(slowPtr);
             return arr.get(index);
         }
         arr.add(slowPtr);
         slowPtr=slowPtr.next;
     }
     return null;

 }
