package week04;

public class palindrome {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverseList(slow);
        while(rev!=null){
            if(head==null) return false;
            if(head.val!=rev.val) return false;
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode fut = curr.next;
            curr.next = prev;
            prev =  curr;
            curr = fut;
        }
        return prev;
    }
}
