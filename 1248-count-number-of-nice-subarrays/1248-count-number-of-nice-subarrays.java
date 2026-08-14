class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ans=0;
        for(int i:nums){
            if(i%2==1) sum++;
            if(map.containsKey(sum-k)) ans+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}