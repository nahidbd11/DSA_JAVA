public class ReverseLinkedList {


     public class ListNode {
     int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    /***
     * two pointer solution
     *
     */

/*    public ListNode reverseList(ListNode head) {

         ListNode prev=null;
         ListNode current=head;
         while (current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;

         }
return prev;
    }*/

    /***
     * recursive solution
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode currentHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return currentHead;
    }


}
