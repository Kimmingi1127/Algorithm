class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = -1; 

        int i = 0;
        while (i < dartResult.length()) {
            int num;
            if (dartResult.charAt(i) == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                num = 10;
                i += 2;
            } else {
                num = dartResult.charAt(i) - '0';
                i++;
            }

            idx++;
            score[idx] = num;

            char bonus = dartResult.charAt(i++);
            if (bonus == 'S') score[idx] = (int) Math.pow(score[idx], 1);
            else if (bonus == 'D') score[idx] = (int) Math.pow(score[idx], 2);
            else if (bonus == 'T') score[idx] = (int) Math.pow(score[idx], 3);

            if (i < dartResult.length()) {
                char opt = dartResult.charAt(i);
                if (opt == '*') {
                    score[idx] *= 2;
                    if (idx > 0) score[idx - 1] *= 2;
                    i++;
                } else if (opt == '#') {
                    score[idx] *= -1;
                    i++;
                }
            }
        }

        return score[0] + score[1] + score[2];
    }
}