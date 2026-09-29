class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int x:piles) max=Math.max(max,x);
        
        int l=1,r=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            long hrs = 0;

            for (int x:piles) hrs+=(x+mid-1)/mid;
                
            if(hrs<=h) r=mid-1;  
            else l=mid+1;   
        }
        return l;
    }
}