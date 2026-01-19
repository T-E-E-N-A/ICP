package week02.Questions;

import java.util.Stack;

public class baseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> si= new Stack<>();
        for(int i=0 ; i<operations.length ; i++){
            if(operations[i].equals("C")){
                si.pop();
            }else if(operations[i].equals("D")){
                si.push(2*si.peek());
            }else if(operations[i].equals("+")){
                int a = si.pop();
                int b = si.peek();
                si.push(a);
                si.push(a+b);
            }else{
                si.push(Integer.parseInt(operations[i]));
            } 
        }
        int sum=0;
        for(int x:si){
            sum+=x;
        }
        return sum;
    }
}
