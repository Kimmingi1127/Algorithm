class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] isSkip = new boolean[26];
        for (int i = 0; i < skip.length(); i++){
            isSkip[skip.charAt(i) - 'a'] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++){
            int cur = s.charAt(i) - 'a';
            int move = 0;
            
            while (move < index){
                cur = (cur + 1) % 26;
                if (isSkip[cur]) continue;
                move++;
            }
        sb.append((char) (cur + 'a'));
        }
        return sb.toString();
    }
}