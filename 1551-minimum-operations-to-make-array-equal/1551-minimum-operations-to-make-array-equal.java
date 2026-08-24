class Solution {
    public int minOperations(int n) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=(2*i)+1;
        int cnt=0;
        int mid;
        if(n%2!=0) mid=arr[n/2];
        else mid=(arr[(n-1)/2]+arr[(n-1)/2+1])/2;
        for(int i=0;i<n/2;i++){
            int b=arr[i];
            while(b!=mid){
                cnt++;
                b++;
            }
        }
        return cnt;
    }
}