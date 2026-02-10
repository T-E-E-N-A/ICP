package week04;

public class linkedList {
    Node ls;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    public linkedList(int val){
        ls = new Node(val);
    }
    public void add(int v){
        ls.next = new Node(v);
    }
}
