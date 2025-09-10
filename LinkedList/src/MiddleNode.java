public class MiddleNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * slow and fast pointer approach
     *
     * @param head
     * @return
     */

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;

    }

 /*   public ListNode middleNode(ListNode head) {

        ListNode current = head;
        int count=;
        while (current!=null) {
               count++;
               current=current.next;

        }
        int middle= count/2 +1;

        current=head;
        while (current!=null){
            middle--;
            if(middle==0) break;
            current=current.next;
        }

      return  current;

    }*/


    /***
     *  hasmap approach
     * @param head
     * @return
     */
/*    public ListNode middleNode(ListNode head) {

        ListNode current=head;
        int count=0;
        HashMap<Integer,ListNode> map=new HashMap();
        while(current!=null){
            map.put(count++,current);
            current=current.next;
        }
        Integer middle= Math.round(count/2);
        return map.get(middle);

    }*/
}
