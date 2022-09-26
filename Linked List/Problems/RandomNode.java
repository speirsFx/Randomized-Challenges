class RandomNode {

  ListNode head;

public Solution(ListNode head) {
  this.head = head;

}

public int getRandom() {

  int counter = 0;
  ListNode curr = head;
  while(curr != null){
      counter++;
      curr = curr.next;
  }

  int rand = (int)(Math.random() *( counter));
  curr = head;

      while(rand > 0){
          curr = curr.next;
          rand--;
      }

  return curr.val;
  }

}
