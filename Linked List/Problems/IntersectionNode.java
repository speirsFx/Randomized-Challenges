class IntersectionNode {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


    ListNode curr = headA;


    int countA = 0;
    while(curr != null){
        countA++;
        curr = curr.next;
    }

    curr = headB;
    int countB = 0;

    while(curr != null){
        countB++;
        curr= curr.next;
    }

    Boolean leftA = false;

    if(countA > countB){
        countA = countA- countB;
        leftA = true;
    }
    else {
        countA = countB-countA;
    }

    if(leftA == true){
        while(countA != 0){
            headA = headA.next;
            countA--;
        }
    }
    else {
        while(countA != 0){
            headB = headB.next;
            countA--;
        }
    }

    while(headA != null && headB != null){
        if(headA == headB)
            return headA;
        headA = headA.next;
        headB = headB.next;
    }



    return null;
}

}
