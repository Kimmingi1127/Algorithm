class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = 0;
        int cntX = 0, cntOther = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (cntX == 0 && cntOther == 0) {
                x = s.charAt(i);
            }

            if (s.charAt(i) == x) cntX++;
            else cntOther++;

            if (cntX == cntOther) {
                answer++;
                cntX = 0;
                cntOther = 0;
            }
        }

        if (cntX != 0 || cntOther != 0) answer++;
        
        return answer;
    }
}