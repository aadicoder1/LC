class Solution {
    public int minimumRecolors(String s, int k) {
        int left=0, right=0 ,cnt=0 , min=Integer.MAX_VALUE;

        // sliding window
        while(right<s.length()){
            char ch=s.charAt(right);
            if(ch=='W') cnt++;
            if(right-left+1==k){
                min=Math.min(cnt, min);
                if(s.charAt(left)=='W') cnt--;
                left++;
            }
            right++;
        }
        return min;
    }
}