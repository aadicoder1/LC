class Solution {
    public int totalFruit(int[] nums) {
        int left=0,right=0;
        int zeroes=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>2){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}