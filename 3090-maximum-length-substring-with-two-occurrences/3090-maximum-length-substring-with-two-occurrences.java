class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count=new int[26]; 
        int maxLen=0;
        int left=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            count[c-'a']++;

            while(count[c-'a']>2){
                count[s.charAt(left)-'a']--;
                left++;
            }
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}