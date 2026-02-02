package week04;

public class addTwoNumber {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next; 
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans = new ListNode(0);
        ListNode ret = ans;
        while(l1!=null || l2!=null){
            ListNode node = new ListNode();
            int val = carry;
            if(l1!=null){
                val += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                val += l2.val;
                l2 = l2.next;
            }
            node.val = val%10;
            carry = val/10;
            ans.next = node;
            ans = ans.next;
        }
        if(carry!=0){
            ListNode node = new ListNode(carry);
            ans.next = node;
        }
        return ret.next;
    }
}
