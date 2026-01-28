package week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class winnerCircularGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findTheWinner(n, k));
        sc.close();
    }

    public static int findTheWinner(int n, int k) {
        // everytime it eliminates one person so loop will run n times
        // after removing one person problem becomes n-1 just indexes shift by a position we can say shifted by a position and i is increasing continuously as elements are getting out
        int i=1;
        int ans=0;
        while(i<=n){
            // This applies the formula. "If I know the winner's index for size i-1, the winner for size i is just that index shifted by k;
            // why mod i , i represents size of that array (length of that short array)
            ans = (ans+k)%i;
            i++;
        }
        return ans+1;
    }


    // this solution will take O(N) space as well O(N) time complexity
    // in queue we are storing elements then traversing and if its kth cnt remove that 
    // otherwise put the elements back into queue and continue traversing 
    public static int findTheWinnerI(int n, int k) {
        Queue<Integer> cir = new LinkedList<>();
        for(int i=0 ; i<n ; i++){
            cir.add(i);
        }
        while(cir.size()>1){
            for(int i=1 ; i<k ; i++){
                cir.add(cir.remove());
            }
            cir.remove();
        }
        return cir.remove()+1;
    }
}
