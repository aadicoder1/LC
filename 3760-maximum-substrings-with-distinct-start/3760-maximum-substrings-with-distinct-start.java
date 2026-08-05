class Solution {
    public int maxDistinct(String s){
        int[] freq=new int[256];
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]==0){
                cnt++;
                freq[s.charAt(i)]++;
            }
        }
        return cnt;
    }
}