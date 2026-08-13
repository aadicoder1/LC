class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:friends) map.put(i,1);
        List<Integer> h=new ArrayList<>();

        for(int i: order){
            if(map.containsKey(i)) h.add(i);
        }

        int[] ans=new int[h.size()];
        for(int i=0;i<h.size();i++) ans[i] = h.get(i);
        return ans;
    }
}