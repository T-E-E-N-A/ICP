package week04;

import java.util.HashMap;
import java.util.Stack;

public class lc_1019 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[] nextLargerNodes(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        int n=0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        int[] ans = new int[n];
        Stack<ListNode> st = new Stack<>();
        temp=head;
        int i=0;
        while(temp!=null){
            while(!st.isEmpty() && st.peek().val<temp.val){
                // System.out.println(temp.val);
                ans[map.get(st.pop())] = temp.val;
            }
            map.put(temp,i);
            st.push(temp);
            temp = temp.next;
            i++;
        }
        return ans;
    }
}
