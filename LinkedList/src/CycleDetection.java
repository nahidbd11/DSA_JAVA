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
}
