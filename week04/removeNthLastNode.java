package week04;

public class removeNthLastNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        for(int i=0 ; i<n ; i++){
            temp = temp.next;
        }
        ListNode temp2 = new ListNode(0);
        temp2.next = head;
        if(temp.next==null) return head.next;
        while(temp!=null && temp.next!=null){
            temp = temp.next;
            temp2 = temp2.next;
        }
        if(temp2!=null && temp2.next!=null)
            temp2.next = temp2.next.next;
        return head;
    }
}
