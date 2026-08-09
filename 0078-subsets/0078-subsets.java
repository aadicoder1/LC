class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        gen(nums,0,list,new ArrayList<>());
        return list;
    }
    public static void gen(int[] nums,int start,List<List<Integer>> list,List<Integer> temp){
        if(start==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[start]);
        gen(nums,start+1,list,temp);
        temp.remove(temp.size()-1);
        gen(nums,start+1,list,temp);
        
    }
}