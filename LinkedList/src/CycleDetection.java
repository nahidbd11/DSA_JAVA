import java.util.HashMap;

public class CycleDetection {
    class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    /**
     * using hasmap solution
     *
     * */
    public boolean hasCycle(ListNode head) {

        ListNode currentNode = head;
        HashMap<ListNode, Integer> map = new HashMap();
        while (currentNode != null) {
            if (map.get(currentNode) != null) return true;
            map.put(currentNode, 1);
            currentNode = currentNode.next;
        }
        return false;
    }

    /***
     *
     *
     * @param head
     * @return bool
     *
     * Start both pointers at the list head.
     *
     * Create two pointers, slow and fast, and set both to head.
     *
     * Keep walking while fast can still move ahead.
     *
     * Enter a loop that continues as long as fast is not null and fast.next is not null. That ensures fast can advance two steps without causing a null-pointer error.
     *
     * Advance the pointers each loop iteration.
     *
     * Move slow forward by one node (slow = slow.next).
     *
     * Move fast forward by two nodes (fast = fast.next.next).
     *
     * After moving, check if they meet.
     *
     * If slow == fast at any time, the two pointers have met inside the list — that means there is a cycle. Return true.
     *
     * If the fast pointer reaches the end, there is no cycle.
     *
     * If the loop ends because fast becomes null or fast.next becomes null, the list has an end and therefore no cycle. Return false.
     */

/*    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;

    }*/
}
