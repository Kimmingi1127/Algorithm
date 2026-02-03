import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N + 2];
        for (int s : stages) {
            count[s]++;
        }
        
        int total = stages.length;
        
        List<int[]> list = new ArrayList<>();
        double[] failRate = new double[N + 1];
        
        for (int i = 1; i <= N; i++){
            if (total == 0){
                failRate[i] = 0;
            } else {
                failRate[i] = (double) count[i] / total;
            }
            total -= count[i];
            list.add(new int[]{i});
        }
        
        list.sort((a,b) ->{
            if (failRate[a[0]] < failRate[b[0]]) return 1;
            if (failRate[a[0]] > failRate[b[0]]) return -1;
            return a[0] - b[0];
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++){
            answer[i] = list.get(i)[0];
        }
        return answer;
    }
}