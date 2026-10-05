class Solution {
    public int countGoodSubstrings(String s) {
        char arr[]=s.toCharArray();
        int left=0,right=0,count=0;
        HashMap<Character,Integer> map= new HashMap<>();

        while(right<s.length()){
            char ch=arr[right];
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(right-left+1==3){
                if(map.size()==3) count++;
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0) map.remove(arr[left]);
                left++;
            }
            right++;
        }
        return count++;
    }
}