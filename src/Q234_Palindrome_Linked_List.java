public class Q234_Palindrome_Linked_List {
}

/*
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        if(head.next.next == null){
            if(head.next.val == head.val) return true;
            else return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow指向链表1结尾
        ListNode dummy = null;
        ListNode pre = dummy;
        ListNode curr = slow.next;
        while(curr != null){//翻转链表2
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        // 比较链表1和链表2
        ListNode head1 = head;
        ListNode head2 = pre;
        while(head2 != null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}
*/
