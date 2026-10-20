class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] ng=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        Arrays.fill(ng,-1);

        for(int i=0;i<2*arr.length;i++){
            int ele=arr[i%arr.length];
            while(!st.isEmpty() && ele>arr[st.peek()]){
                ng[st.pop()]=arr[i%arr.length];
            }
            st.push(i%arr.length);
        }
        return ng;
    }
}