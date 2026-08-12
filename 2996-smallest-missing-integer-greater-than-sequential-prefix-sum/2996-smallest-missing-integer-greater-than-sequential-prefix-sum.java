class Solution {
    public int missingInteger(int[] arr) {
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1) sum+=arr[i];
            else break;
        }
        HashSet<Integer> set=new HashSet<>();

        for(int x:arr) set.add(x);
        while(set.contains(sum)) sum++;

        return sum;
    }
}