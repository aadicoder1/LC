class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n==1) return true;
        boolean flag=true;

        if (Character.isLowerCase(word.charAt(0))) {
            for(int i=1;i<n;i++){
                if (Character.isUpperCase(word.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        } else {
            if (Character.isLowerCase(word.charAt(1))){
                for(int i=2;i<n;i++){
                    if (Character.isUpperCase(word.charAt(i))) {
                        flag=false;
                        break;
                    }
                }
            }else{
                for(int i=2;i<n;i++){
                    if (Character.isLowerCase(word.charAt(i))){
                        flag=false;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}