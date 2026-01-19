package week01;

import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1174/a
public class A1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag=true;
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
            if(i>0 && arr[i]!=arr[i-1]) flag=false;
        }
        if(flag || (n&1)==1){
            System.out.println(-1);
        }else{
            Arrays.sort(arr);
            for(int x : arr) System.out.print(x+" ");
        }
    }
}
