package week01;

public class countPrime {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] vis = new boolean[n+1];
        vis[0]=vis[1]=true;
        int c=0;
        for(int i=2 ; i*i<n ; i++){
            if(vis[i]) continue;
            for(int j=2*i ; j<n ; j+=i){
                vis[j] = true;
            }
        }
        for(int i=0 ; i<n ; i++) if(!vis[i]) c++;
        return c;
    }
}
