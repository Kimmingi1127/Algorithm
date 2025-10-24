class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String answer = "";
        
        int startCount = len - 4;
        
        for(int i = 0; i < startCount; i++) {
            answer += "*";
        }
        
        answer += phone_number.substring(len - 4);
        
        return answer;
    }
}