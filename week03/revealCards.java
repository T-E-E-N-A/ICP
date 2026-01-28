package week03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class revealCards {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0 ; i<deck.length ; i++) qu.add(i);
        Arrays.sort(deck);
        int i=0;
        int[] ans = new int[deck.length];
        while(qu.size()>1){
            ans[qu.poll()] = deck[i++];
            if(!qu.isEmpty()) qu.add(qu.poll());
        }
        if(!qu.isEmpty()) ans[qu.poll()] = deck[i];
        return ans;
    }
}
