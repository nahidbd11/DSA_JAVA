import java.util.Stack;

public class Palindrome {
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

    /****
     * stack solution
     * TC=O(N)
     * SC=O(N)
     * @param head
     * @return
     */

/*    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack();
        ListNode current=head;
        while(current!=null){
            stack.push(current.val);
            current=current.next;
        }

        current=head;
        while(!stack.isEmpty()){
            if(stack.pop()!=current.val) return false;
            current=current.next;
        }

        return true;
    }*/


    /******
     * find middle
     * reverse other half middle
     * compare two half
     *
     * TC(N)
     * SC(1)
     * @param head
     * @return
     */

/*    public boolean isPalindrome(ListNode head) {

            ListNode slow=head;
            ListNode fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }

            ListNode newHead=reverseNode(slow.next);
            ListNode currentFirst=head;
            ListNode currentSecond=newHead;
            while(currentSecond!=null){
                if(currentFirst.val!=currentSecond.val){
                    //reverseNode(newHead);
                    return false;
                }
                currentFirst=currentFirst.next;
                currentSecond=currentSecond.next;
            }

            //reverseNode(newHead);
            return true;




    }*/

    public  ListNode reverseNode(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead=reverseNode(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }


    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;  // reversed first half
        ListNode curr = head;

        // Step 1: Reverse first half while finding the middle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;  // move fast 2 steps
            slow = slow.next;       // move slow 1 step

            // reverse one node
            curr.next = prev;
            prev = curr;
            curr = slow;
        }

        // Step 2: Skip the middle node if odd length
        if (fast != null) {
            slow = slow.next;
        }

        // Step 3: Compare reversed first half with second half
        ListNode left = prev;
        ListNode right = slow;
        while (left != null ) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
