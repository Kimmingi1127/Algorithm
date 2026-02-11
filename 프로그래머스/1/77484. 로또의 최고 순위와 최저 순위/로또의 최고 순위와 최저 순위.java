import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();
        for (int w : win_nums) winSet.add(w);

        int zero = 0;
        int match = 0;

        for (int x : lottos) {
            if (x == 0) zero++;
            else if (winSet.contains(x)) match++;
        }

        int best = match + zero;
        int worst = match;

        return new int[] { toRank(best), toRank(worst) };
    }

    private int toRank(int cnt) {
        if (cnt <= 1) return 6;
        return 7 - cnt;
    }
}