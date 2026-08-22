class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt1=0, cnt0=0 ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') cnt1++;
            else if(s.charAt(i)=='0') cnt0++;
        }
    
        return "1".repeat(cnt1 - 1) + "0".repeat(cnt0) + "1";
    }
}