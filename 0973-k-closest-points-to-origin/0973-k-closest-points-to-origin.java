class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->Integer.compare(a[0], b[0]));
        for(int i=0;i<points.length;i++){
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.offer(new int[]{dist, i});
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            res[i]=points[pq.poll()[1]];
        }
        return res;
    }
}