class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int totalDays = 0;
        
        for(int i = 0; i < a -1; i++){
            totalDays += monthDays[i];
        }
        
        totalDays += (b - 1);
        
        return days[(5 + totalDays) % 7];
    }
}