class Solution {
    public int solution(int[] wallet, int[] bill) {
        int wMin = Math.min(wallet[0], wallet[1]);
        int wMax = Math.max(wallet[0], wallet[1]);
        
        int b0 = bill[0];
        int b1 = bill[1];
        
        int answer = 0;
        
        while (Math.min(b0, b1) > wMin || Math.max(b0, b1) > wMax) {
            if (b0 >= b1) b0 /= 2; 
            else b1 /= 2;
            answer++;
        }
        return answer;
    }
}