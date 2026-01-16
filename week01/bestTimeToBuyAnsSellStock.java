package week01;

import java.util.Scanner;

public class bestTimeToBuyAnsSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
    // approach-1
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=0 ; i<prices.length ; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }else if(prices[i] - buy>profit){
                profit = prices[i]-buy;
            }
        }
        return profit;
    }
}
