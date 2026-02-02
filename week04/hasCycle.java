package week04;

public class hasCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean has_cycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(null!=fast && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
