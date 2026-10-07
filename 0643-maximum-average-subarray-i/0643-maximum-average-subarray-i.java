class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int left=0,right=0;
        double sum=0,max=Double.NEGATIVE_INFINITY;

        //sliding window
        while(right<arr.length){
            sum+=arr[right];
            if(right-left+1==k){
                max=Math.max(sum,max);
                sum-=arr[left];
                left++;
            }right++;
        }
        return max/k;
    }
}