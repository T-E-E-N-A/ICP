package week02.Questions;

public class removeOuterMost {
    public String removeOuterParentheses(String s) {
        int open=0,close=0;
        int start=1;
        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='(') open++;
            else close++;
            if(open==close){
                for(int j=start ; j<i ; j++){
                    ans.append(s.charAt(j));
                }
                open=0;
                close=0;
                start=i+2;
            }
        }
        if(open==close){
            for(int j=start ; j<s.length() ; j++){
                ans.append(s.charAt(j));
            }
        }
        return ans+"";
    }
}
