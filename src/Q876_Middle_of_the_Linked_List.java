public class Q876_Middle_of_the_Linked_List {
}
/*
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        if(head.next.next == null) return head.next;
        ListNode slow = head.next; ListNode fast = head.next.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null) return slow;
        else return slow.next;
    }
}*/
