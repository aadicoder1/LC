class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int r1=nums[n]*nums[0]*nums[1];
        int r2=nums[n]*nums[n-1]*nums[n-2];
        return Math.max(r1,r2);
    }
}