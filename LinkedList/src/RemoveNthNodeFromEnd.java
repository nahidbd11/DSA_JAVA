public class RemoveNthNodeFromEnd {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    /***
     *
     *
     * @param head
     * @param n
     * @return head
     * Initialize two pointers: slow and fast, both pointing to head.
     *
     * Move fast ahead by n steps.
     *
     * Check if fast becomes null after moving:
     *
     * If yes, it means the node to remove is the head, so return head.next.
     *
     * Traverse the list with both pointers:
     *
     * Move slow and fast one step at a time until fast.next == null.
     *
     * At this point, slow points to the node just before the target node.
     *
     * Remove the nth node from the end:
     *
     * Set slow.next = slow.next.next.
     *
     * Return the modified list’s head.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(fast==null) return head.next;
        slow.next=slow.next.next;
        return head;
    }


    /*******
     *
     *
     * @param head
     * @param n
     * @return head
     * Count the total nodes:
     *
     * Start from the head and traverse the list once.
     *
     * Keep a counter count of how many nodes are in the list.
     *
     * Check if the node to remove is the head itself:
     *
     * If the total number of nodes equals n, it means the nth node from the end is the first node.
     *
     * So, just return head.next as the new head.
     *
     * Find the node just before the target:
     *
     * Compute diff = count - n.
     *
     * This gives the number of steps needed from the head to reach the node just before the one we want to remove.
     *
     * Traverse again until diff becomes 0.
     *
     * Delete the target node:
     *
     * Change the link: temp.next = temp.next.next
     *
     * This skips the target node, effectively removing it from the list.
     *
     * Return the (possibly unchanged) head of the list.
     */
/*    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            ListNode newHead=head.next;
            return newHead;
        }

        int diff=count-n;
        temp=head;
        while(temp!=null){
            diff--;
            if(diff==0) break;
            temp=temp.next;
        }

        temp.next=temp.next.next;
        return head;
    }*/

}
