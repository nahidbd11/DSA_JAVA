public class FindIntersection {


     public class ListNode {
          int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

    /**
     *
     * @param headA
     * @param headB
     * @return intersection head
     *
     * two pointer solution
     * ==============================
     * Check null case → If either headA or headB is null, return null.
     *
     * Initialize pointers → Set tempA = headA and tempB = headB.
     *
     * Traverse both lists → Move tempA and tempB one step at a time.
     *
     * Switch heads when null →
     *
     * If tempA reaches null, reset it to headB.
     *
     * If tempB reaches null, reset it to headA.
     *
     * Check intersection → Continue until tempA == tempB.
     *
     * Return result → Return the intersection node if found, otherwise return null.
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null || headB==null) return null;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
            if(tempA==tempB) return tempA;
            if(tempA==null) tempA=headB;
            if(tempB==null) tempB=headA;
        }

        return tempA;

    }




    public int getListLength(ListNode list){
        int count=0;
        while(list!=null){
            count++;
            list=list.next;
        }
        return count;
    }

    /****
     *
     * @param headA
     * @param headB
     * @return intersection head
     *First, it calculates the lengths of both lists.
     *
     * Then, it moves the head of the longer list forward so that both lists are aligned at the same remaining length.
     *
     * After alignment, it moves both pointers one step at a time until they meet.
     *
     * If they meet, that node is the intersection; if not, both reach null, meaning no intersection.
     *
     */
/*    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int nA=getListLength(headA);
        int nB=getListLength(headB);

        while(nA>nB){
            nA--;
            headA=headA.next;
        }

        while(nB>nA){
            nB--;
            headB=headB.next;
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;

    }*/



}
