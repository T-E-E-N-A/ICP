import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i:asteroids){
            if(i>0){
                st.push(i);
                continue;
            }
            while(!st.isEmpty() && st.peek()>0 && st.peek()+i<0){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()+i==0){
                st.pop();
            }else if(st.isEmpty() || st.peek()<0) st.push(i);
        }
        int[] ans = new int[st.size()];
        int k=st.size()-1;
        while(!st.isEmpty()){
            ans[k--] = st.pop();
        }
        return ans;
    }
}