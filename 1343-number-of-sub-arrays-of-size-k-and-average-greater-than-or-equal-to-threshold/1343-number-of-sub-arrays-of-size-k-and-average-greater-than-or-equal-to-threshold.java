class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0,right=0,cnt=0,sum=0;

        //sliding window
        while(right<arr.length){
            sum+=arr[right];
            if(right-left+1==k){
                if(sum/k>=threshold) cnt++;
                sum-=arr[left];
                left++;
            }right++;
        }
        return cnt;
    }
}