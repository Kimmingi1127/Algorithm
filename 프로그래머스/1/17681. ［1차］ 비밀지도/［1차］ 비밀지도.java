class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            int line = arr1[i] | arr2[i];
            StringBuilder sb = new StringBuilder();
            
            for(int bit = n - 1; bit >= 0; bit--){
                if((line & (1 << bit)) != 0) sb.append('#');
                else sb.append(' ');
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}