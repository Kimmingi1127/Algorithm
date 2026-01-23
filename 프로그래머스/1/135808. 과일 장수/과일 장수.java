import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int n = score.length;
        int boxes = n / m;
        int profit = 0;
        
        for(int i = 1; i <= boxes; i++){
            int minInBox = score[n - i * m];
            profit += minInBox * m;
        }
        return profit;
    }
}