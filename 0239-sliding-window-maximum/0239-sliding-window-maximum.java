class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left=0,right=0;
        Deque<Integer> dq=new ArrayDeque<>();
        int[] res=new int[nums.length-k+1];

        while(right<nums.length){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[right]) dq.pollLast();

            dq.addLast(right);
            if(right-left+1==k){
                if(dq.peekFirst()<left) dq.pollFirst();
                res[left]=nums[dq.peekFirst()];
                left++;
            } right++;
        } return res;
    }
}