import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] minPress = new int [26];
        Arrays.fill(minPress, Integer.MAX_VALUE);
        
        for (String key : keymap){
            for(int i = 0; i < key.length(); i++){
                int idx = key.charAt(i) - 'A';
                minPress[idx] = Math.min(minPress[idx], i + 1);
            }
        }
        int [] answer = new int[targets.length];
        
        for(int t = 0; t < targets.length; t++){
           String target = targets[t];
            int sum = 0;
            boolean possible = true;

            for (int i = 0; i < target.length(); i++) {
                int idx = target.charAt(i) - 'A';
                if (minPress[idx] == Integer.MAX_VALUE) {
                    possible = false;
                    break;
                }
                sum += minPress[idx];
            }

            answer[t] = possible ? sum : -1;
        }
        return answer;
    }
}