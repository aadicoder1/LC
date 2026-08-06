class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int m=n;
            int dp=1;

            while(m>0){
                dp*=m%10;
                m/=10;
            }
            if(dp%t==0){
                return n;
            }
            n++;
        }
    }
}