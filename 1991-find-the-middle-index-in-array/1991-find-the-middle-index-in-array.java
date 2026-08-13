class Solution {
    public int findMiddleIndex(int[] nums) {
        int lt=0;
        int total=0;
        for(int i:nums) total+=i;
        
        for(int i=0;i<nums.length;i++){
            int rt=total-lt-nums[i];
            if(rt==lt) return i;
            lt+=nums[i];
        }
        return -1;
    }
}