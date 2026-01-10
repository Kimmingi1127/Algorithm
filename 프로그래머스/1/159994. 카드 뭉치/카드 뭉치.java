class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        
        for (int g = 0; g < goal.length; g++){
            String word = goal[g];
            
            if (i < cards1.length && cards1[i].equals(word)) {
                i++;
            }
            
            else if (j < cards2.length && cards2[j].equals(word))             {
                j++;
            }
            else {
                return "No";
            }
        }
            
        return "Yes";
    }
}