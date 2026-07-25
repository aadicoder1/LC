class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int cnt=0;
        while(i<j){
            while(i<j && nums[i]!=0) i++;
            while(i<j && nums[j]==0) j--;
            if(i<j){
                cnt++;
                i++;
                j--;
            }
        }
        return cnt;
    }
}