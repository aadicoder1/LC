class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();

        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";

        for(char c:r1.toCharArray()) map.put(c,1);
        for(char c:r2.toCharArray()) map.put(c,2);
        for(char c:r3.toCharArray()) map.put(c,3);

        ArrayList<String> res=new ArrayList<>();
        for (String word:words) {
            String lower=word.toLowerCase();
            int row=map.get(lower.charAt(0));
            boolean valid=true;

            for(char c:lower.toCharArray()){
                if(map.get(c)!=row){
                    valid=false;
                    break;
                }
            }
            if(valid) res.add(word);
        }
        return res.toArray(new String[0]);
    }
}