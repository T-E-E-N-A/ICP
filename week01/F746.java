package week01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class F746 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stt = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(stt.nextToken());
        int half = Integer.parseInt(stt.nextToken());
        int totalTime = Integer.parseInt(stt.nextToken());
        
        int[][] arr = new int[n][2];
        
        stt = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(stt.nextToken());
        }
        
        stt = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i][1] = Integer.parseInt(stt.nextToken());
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int time=0,r=0;
        int st=0,ans=0;
        for(int i=0 ; i<n ; i++){
            time += arr[i][1];
            r += arr[i][0];
            int w = arr[i][1] - (arr[i][1]/2 + (arr[i][1]%2));
            pq.add(w);
            while(st<=i){
                int saved = 0;
                int tem=0;
                for(int save : pq){
                    if(tem>=half) break;
                    saved += save;
                    tem++;
                }

                if(time-saved<=totalTime) break;

                w = arr[st][1] - (arr[st][1]/2 + (arr[st][1]%2));
                time -= arr[st][1];
                r -= arr[st][0];
                pq.remove(w);
                st++;
            }
            ans = Math.max(ans,r);
            // System.out.println(st+" "+i+" "+r);
        }
        System.out.println(ans);
    }
}
