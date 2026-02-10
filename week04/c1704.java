package week04;

import java.util.Arrays;
import java.util.Scanner;

public class c1704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int len = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int[] prefix = new int[n];
            int k=0;
            prefix[k++] = len-arr[n-1] + arr[0]-1;
            Arrays.sort(arr);
            for(int i=1 ; i<n ; i++){
                prefix[k++] = arr[i]-arr[i-1]-1;
            }
            Arrays.sort(prefix);
            if(prefix[n-1]==1){
                if(arr[n-1]!=len || arr[0]!=1){
                    System.out.println(n-1);
                }else{
                    System.out.println(n);
                }
                continue;
            }
            long ans = 0, days = 0;
			for (int g : prefix) {
				int rem = g - (int)(days * 2);
				if (rem <= 0) continue;
				if (rem == 1) ans += 1;
				else {
					ans += rem - 1;
					days++;
				}
				days++;
			}
            System.out.println(len-ans);
        }
    }
}
