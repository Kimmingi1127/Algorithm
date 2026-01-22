class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int paintedEnd = 0;
        
        for (int s : section) {
            if (s > paintedEnd){
                count++;
                paintedEnd = s + m - 1;
            }
        }
        return count;
    }
}