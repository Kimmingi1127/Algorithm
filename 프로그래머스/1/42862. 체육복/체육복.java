import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int l : lost) lostSet.add(l);
        for (int r : reserve) reserveSet.add(r);

        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r);
                reserveSet.remove(r);
            }
        }

        answer -= lostSet.size();

        for (int l : lost) {
            if (!lostSet.contains(l)) continue;

            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
                answer++;
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
                answer++;
            }
        }

        return answer;
    }
}