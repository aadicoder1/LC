class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();

        for (int[] seat:reservedSeats) {
            int row = seat[0];
            int number = seat[1];
            if (!rows.containsKey(row)) rows.put(row, new HashSet<>());
            rows.get(row).add(number);
        }
        int families=(n-rows.size())*2;
        for(int row:rows.keySet()){
            HashSet<Integer> reserved=rows.get(row);

            boolean left=true;
            boolean middle=true;
            boolean right=true;

            for(int seat=2;seat<=5;seat++)
                if (reserved.contains(seat))
                    left=false;
            for(int seat=4;seat<=7;seat++)
                if (reserved.contains(seat))
                    middle=false;
            for(int seat=6;seat<=9;seat++)
                if (reserved.contains(seat))
                    right=false;
            if (left && right)
                families+=2;
            else if (left || middle || right)
                families++;
        }
        return families;
    }
}