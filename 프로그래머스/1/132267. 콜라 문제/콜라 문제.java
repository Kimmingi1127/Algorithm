class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int exchange = n / a;
            int received = exchange * b;
            
            answer += received;
                
            n = (n % a) + received;
        }
        return answer;
    }
}