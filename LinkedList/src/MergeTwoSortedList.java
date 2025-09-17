public class MergeTwoSortedList {


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

/***
 * Recursive solution
 * 1. Base case if one list is null then reutrn another list
 * 2. choose list1 as smallest list or swap between two list if list1 > list2 list1 always point to smallest list
 * 3. choose list1.next recursively
 * 4.return list1 as the smallest list
 */

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy=new ListNode(0);
    ListNode current=dummy;
    while(list1!=null & list2!=null){
        if(list1.val<list2.val){
            current.next=list1;
            current=list1;
            list1=list1.next;
        }
        else{
            current.next=list2;
            current=list2;
            list2=list2.next;
        }
    }

    if(list1!=null) current.next=list1;
    else current.next=list2;
    return dummy.next;

}

/**
 * Create a fixed starter node (dummy) to anchor the merged list.
 *
 * Maintain a pointer (current) to the last node of the merged list; initially it points to the dummy.
 *
 * While both input lists still have nodes:
 *
 * Compare the values at the current nodes of the two lists.
 *
 * Choose the node with the smaller value.
 *
 * Append that node to the merged list by linking it after current.
 *
 * Advance current to that appended node.
 *
 * Advance the pointer of the list from which you took the node.
 *
 * After the loop, exactly one input list may still contain nodes — link the remaining nodes to the merged list.
 *
 * Return the merged list starting at the node after the dummy.
 */
/*public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy=new ListNode(0);
    ListNode current=dummy;
    while(list1!=null & list2!=null){
        if(list1.val<list2.val){
            current.next=list1;
            current=list1;
            list1=list1.next;
        }
        else{
            current.next=list2;
            current=list2;
            list2=list2.next;
        }
    }

    if(list1!=null) current.next=list1;
    else current.next=list2;
    return dummy.next;

}*/

}
