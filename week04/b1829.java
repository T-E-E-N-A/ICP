package week04;

import java.util.Scanner;

public class b1829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int ans=0,cnt=0;
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i]==0) cnt++;
                else{
                    ans = Math.max(cnt,ans);
                    cnt=0;
                }
            }
            System.out.println(Math.max(ans,cnt));
        }
    }
}
