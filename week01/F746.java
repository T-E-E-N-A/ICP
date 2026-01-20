package week01;
import java.util.Scanner;

public class F746 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half = sc.nextInt();
        int relax = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0 ; i<n ; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int sum=0;
        for(int i=0 ; i<n ; i++){
            sum += arr[i][0];
            if(sum>=relax){
                // use priorityQueue to calculate cost with half songs as well
            }
        }
        sc.close();
    }
}
