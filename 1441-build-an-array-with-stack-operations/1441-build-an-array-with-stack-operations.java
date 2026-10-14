class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n && j<target.length;i++){
            l.add("Push");
            if(i==target[j]) j++;
            else l.add("Pop");
        }
        return l;
    }
}