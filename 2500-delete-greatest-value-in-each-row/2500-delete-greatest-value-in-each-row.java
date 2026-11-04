class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        for(int k=0;k<n;k++){
            int max=0;
            for(int i=0;i<m;i++){
                int maxi=0,idx=-1;
                for(int j=0;j<n;j++){
                    if(grid[i][j]>maxi){
                        maxi=grid[i][j];
                        idx=j;
                    }
                }
                max = Math.max(maxi,max);
                grid[i][idx]=0;
            }
            ans+=max;
        }
        return ans;
    }
}