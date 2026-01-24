package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class asteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] ans = asteroidCollisions(arr);

        for(int x : ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
    public static int[] asteroidCollisions(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<asteroids.length ; i++){
            boolean flag = true;
            while(!st.isEmpty() && asteroids[st.peek()]>0 && asteroids[i]<0 && flag){
                if(asteroids[st.peek()]>0-asteroids[i]){
                    flag = false;
                }else if(asteroids[st.peek()]+asteroids[i]==0){
                    st.pop();
                    flag = false;
                }else st.pop();
            }
            if(flag) st.push(i);
        }
        int[] ans = new int[st.size()];
        int  n = st.size()-1;
        while(!st.isEmpty()){
            ans[n--] = asteroids[st.pop()];
        }
        return ans;
    }
}
