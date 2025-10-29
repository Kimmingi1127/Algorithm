class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            if (isPerfectSquare(i)) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
    
    private boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}