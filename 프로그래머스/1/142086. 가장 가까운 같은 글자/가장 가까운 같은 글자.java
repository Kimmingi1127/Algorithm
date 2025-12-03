class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        
        int[] lastIndex = new int[26];
        for(int i = 0; i < 26; i++){
            lastIndex[i] = -1;
        }
        for (int i =0; i< len; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            
            if(lastIndex[idx] == -1){
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex[idx];
            }
            lastIndex[idx] = i;
        }
        return answer;
    }
}