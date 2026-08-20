class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> lst1=new ArrayList<>();
        List<Integer> lst2=new ArrayList<>();

        lst1.add(nums[0]);
        lst2.add(nums[1]);
        
        for(int i=2;i<nums.length;i++){
            if(lst1.get(lst1.size()-1)>lst2.get(lst2.size()-1)) lst1.add(nums[i]);
            else lst2.add(nums[i]);
        }
        lst1.addAll(lst2);
        for(int i=0;i<lst1.size();i++) nums[i]=lst1.get(i);
        return nums;
    }
}