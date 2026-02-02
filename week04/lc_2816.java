package week04;

public class lc_2816 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode doubleIt(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode ret = ans;
        ListNode rev = reverseList(head);
        int carry = 0;
        while(rev!=null){
            int val = rev.val*2 + carry;
            carry = val/10;
            ans.next = (new ListNode(val%10));
            ans = ans.next;
            rev = rev.next;
        }
        if(carry!=0){
            ans.next = new ListNode(carry);
        }
        return reverseList(ret.next);
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
