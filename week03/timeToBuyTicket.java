package week03;

import java.util.Scanner;

public class timeToBuyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] tickets = new int[n];
        for(int i=0 ; i<n ; i++){
            tickets[i] = sc.nextInt();
        }
        System.out.println(timeRequiredToBuy(tickets,k));
        sc.close();
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int cnt=0;
        int range = tickets[k];
        for(int i=0 ; i<tickets.length ; i++){
            if(i<=k){
                cnt += Math.min(range,tickets[i]);
            }else{
                cnt += Math.min(range-1,tickets[i]);
            }
        }
        return cnt;
    }
}
