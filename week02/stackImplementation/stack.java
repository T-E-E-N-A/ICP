package week02.stackImplementation;

public class stack {
    public static void main(String[] args) {
        arrayStack st = new arrayStack(3);
        System.out.println("Empty: "+st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("Full: "+st.isFull());
        System.out.println(st.pop());

        listStack st2 = new listStack();
        st2.push(1);
        st2.push(3);
        st2.push(2);
        System.out.println(st2.peek());
    }
}
