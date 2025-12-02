class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int len = p.length();
        long val = Long.parseLong(p);
        
        for(int i=0; i<=t.length() - len; i++){
            String sub = t.substring(i, i + len);
            long subVal = Long.parseLong(sub);
            
            if (subVal <= val){
                count++;
            }
        }
        return count;
    }
}