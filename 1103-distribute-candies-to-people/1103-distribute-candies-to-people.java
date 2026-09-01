class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int give=1;

        while(candies>0) {
            for(int i=0;i<num_people && candies>0;i++){
                int amount=Math.min(give,candies);
                arr[i]+=amount;
                candies-=amount;
                give++;
            }
        }
        return arr;
    }
}