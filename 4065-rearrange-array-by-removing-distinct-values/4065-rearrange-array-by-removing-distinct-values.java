class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];
        for (int x : nums) freq[x]++;
        List<Integer> keys = new ArrayList<>();
        for (int x = 1; x <= 100; x++)
            if (freq[x] > 0) keys.add(x);
        int[] ans = new int[nums.length];
        int i = 0;
        while (!keys.isEmpty()) {
            for (int x : keys) ans[i++] = x;
            keys.removeIf(x -> --freq[x] == 0);
        }
        return ans;
    }
}