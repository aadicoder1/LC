class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length(),left=0,right=0;
        if(k>s2.length()) return false;
        int[] freq1=new int[256];
        int[] winfreq=new int[256];
        for (char ch:s1.toCharArray()) freq1[ch]++;
    
        while(right<s2.length()){
            winfreq[s2.charAt(right)]++;
            if(right-left+1==k){
                if(Arrays.equals(freq1,winfreq)) return true;
                winfreq[s2.charAt(left)]--;
                left++;
            }right++;
        }
        return false;
    }
}