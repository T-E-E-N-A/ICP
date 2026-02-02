package week04;

public class intersection {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null && temp2!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(temp1!=null){
            a = a.next;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            b = b.next;
            temp2 = temp2.next;
        }
        // System.out.println(a.val+" "+b.val);
        while(a!=null && b!=null){
            if(a==b) return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }
}
