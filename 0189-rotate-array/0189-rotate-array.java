class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        if(nums.length==0){
            return;
        }
        k = k%nums.length;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
        
    }
    public int[] reverse(int[] nums , int str , int end){
        while(str<end){
            int temp=nums[str];
            nums[str]=nums[end];
            nums[end]=temp;
            str++;
            end--;
        }
        return nums;
    }
}