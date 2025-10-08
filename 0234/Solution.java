    // Definition for singly-linked list.
class Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode temp = new ListNode();
        ListNode per = head;
        while(per!=null){
            ListNode hell = new ListNode();
            temp.val = per.val;
            hell.next = temp;
            temp = hell;
            per = per.next;
        }
        per = head;
        temp = temp.next;
        while(temp!=null){
            if(temp.val!=per.val){
                return false;
            }
            System.out.println(temp.val);
            temp = temp.next;
            per = per.next;
        }
        return true;
    }
}