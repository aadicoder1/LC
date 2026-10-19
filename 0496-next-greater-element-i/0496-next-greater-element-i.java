class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ng = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ng, -1);

        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && nums2[i] > nums2[st.peek()]) {
                ng[st.pop()] = nums2[i];
            }
            st.push(i);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[i] = ng[j];
                    break;
                }
            }
        }

        return ans;
    }
}