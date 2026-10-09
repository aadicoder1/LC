class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,max=0;
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> freq=new HashMap<>();

        while(right<arr.length){
            freq.put(arr[right],freq.getOrDefault(arr[right],0)+1);
            while(right-left+1>freq.size()){
                freq.put(arr[left],freq.get(arr[left])-1);
                if(freq.get(arr[left])==0) freq.remove(arr[left]);
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}