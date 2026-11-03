class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{return Integer.compare(b,a);});
        for(int i:nums) pq.offer(i);
        return (pq.poll()-1)*(pq.poll()-1);
    }
}