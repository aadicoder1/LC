class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int area=0;

        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:heights[i];
            while(!st.isEmpty() && heights[st.peek()]>curr){
                int h=heights[st.pop()];
                int w=st.isEmpty()?i:i-st.peek()-1;
                area=Math.max(area,h*w);
            }
            st.push(i);
        }
        return area;
    }
}