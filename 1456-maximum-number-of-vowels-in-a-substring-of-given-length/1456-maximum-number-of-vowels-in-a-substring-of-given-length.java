class Solution {
    public int maxVowels(String s, int k) {
        int left=0, right=0 ,cnt=0 , max=0;

        // sliding window
        while(right<s.length()){
            char ch=s.charAt(right);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') cnt++;
            if(right-left+1==k){
                max=Math.max(cnt, max);
                if(s.charAt(left)=='a' || s.charAt(left)=='e' || s.charAt(left)=='i' || s.charAt(left)=='o' || s.charAt(left)=='u') cnt--;
                left++;
            }
            right++;
        }
        return max;
    }
}