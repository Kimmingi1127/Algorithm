class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String word : babbling) {
            int idx = 0;
            String prev = "";

            boolean ok = true;

            while (idx < word.length()) {
                boolean matched = false;

                for (String s : sounds) {
                    if (word.startsWith(s, idx)) {
                        if (s.equals(prev)) { 
                            ok = false;
                            break;
                        }
                        idx += s.length();
                        prev = s;
                        matched = true;
                        break;
                    }
                }

                if (!ok) break;
                if (!matched) { 
                    ok = false;
                    break;
                }
            }

            if (ok) answer++;
        }
        return answer;
    }
}